package com.eugeniusz.geometry_api.service;

import com.eugeniusz.geometry_api.api.exceptions.ShapeNotFoundException;
import com.eugeniusz.geometry_api.dto.mappers.SearchFilterMapper;
import com.eugeniusz.geometry_api.dto.post.ShapeCreateRequest;
import com.eugeniusz.geometry_api.dto.search.filters.ShapeRequestFilter;
import com.eugeniusz.geometry_api.factory.create.ShapeFactory;
import com.eugeniusz.geometry_api.model.shape.Circle;
import com.eugeniusz.geometry_api.model.shape.Shape;
import com.eugeniusz.geometry_api.model.shape.ShapeType;
import com.eugeniusz.geometry_api.repository.CircleRepository;
import com.eugeniusz.geometry_api.repository.RectangleRepository;
import com.eugeniusz.geometry_api.repository.SquareRepository;
import com.eugeniusz.geometry_api.repository.specifications.CircleSpecification;
import com.eugeniusz.geometry_api.repository.ShapeRepository;
import com.eugeniusz.geometry_api.repository.specifications.RectangleSpecification;
import com.eugeniusz.geometry_api.repository.specifications.SquareSpecification;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = lombok.AccessLevel.PRIVATE)
@Slf4j
public class ShapeService {

    ShapeRepository repository;
    CircleRepository circleRepository;

    SquareRepository squareRepository;

    RectangleRepository rectangleRepository;

    SearchFilterMapper mapper;

    @Transactional
    public Shape save(ShapeCreateRequest request) {
        return repository.save(ShapeFactory.createShape(request));
    }

    public Page<? extends Shape> getAll(ShapeRequestFilter request) {
        log.info("ShapeRequestFilter: {}", request);
        if(request.type() == ShapeType.CIRCLE)
            return getAllCircles(request);
        else if(request.type() == ShapeType.RECTANGLE)
            return getAllRectangles(request);
        else if(request.type() == ShapeType.SQUARE)
            return getAllSquares(request);
        else
        return null;
    }

    private Page<? extends Shape> getAllSquares(ShapeRequestFilter request) {
        return squareRepository.findAll(
                new SquareSpecification(mapper.toSquareFilter(request)),
                request.toPageRequest()
        );
    }

    private Page<? extends Shape> getAllRectangles(ShapeRequestFilter request) {
        return rectangleRepository.findAll(
                new RectangleSpecification(mapper.toRectangleFilter(request)),
                request.toPageRequest()
        );
    }

    private Page<Circle> getAllCircles(ShapeRequestFilter request) {
        return circleRepository.findAll(
                new CircleSpecification(mapper.toCircleFilter(request)),
                request.toPageRequest()
        );
    }


    @Transactional
    public void deleteById(Long id) throws ShapeNotFoundException {
        if(!repository.existsById(id))
            throw new ShapeNotFoundException(id);
        repository.deleteById(id);
    }

    @Transactional
    public Shape update(Long id, ShapeCreateRequest request) {
        if(!repository.existsById(id))
            throw new ShapeNotFoundException(id);
        else
            return ShapeFactory.updateShape(
                    request,
                    repository.findById(id).orElseThrow(() -> new ShapeNotFoundException(id)));
    }

    public Shape getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ShapeNotFoundException(id));
    }
}
