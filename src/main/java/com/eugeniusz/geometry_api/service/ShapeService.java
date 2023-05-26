package com.eugeniusz.geometry_api.service;

import com.eugeniusz.geometry_api.api.exceptions.ShapeNotFoundException;
import com.eugeniusz.geometry_api.dto.post.ShapeCreateRequest;
import com.eugeniusz.geometry_api.dto.search.filters.ShapeRequestFilter;
import com.eugeniusz.geometry_api.factory.create.ShapeFactory;
import com.eugeniusz.geometry_api.model.shape.Shape;
import com.eugeniusz.geometry_api.repository.ShapeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = lombok.AccessLevel.PRIVATE)
public class ShapeService {

    ShapeRepository repository;

    @Transactional
    public Shape save(ShapeCreateRequest request) {
        return repository.save(ShapeFactory.createShape(request));
    }

    public Page<Shape> getAll(ShapeRequestFilter request) {
        Pageable page = request.toPageRequest();
        return repository.findAll(page);
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
