package com.eugeniusz.geometry_api.service;

import com.eugeniusz.geometry_api.api.ShapePageRequest;
import com.eugeniusz.geometry_api.model.shape.Shape;
import com.eugeniusz.geometry_api.repository.ShapeRepository;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = lombok.AccessLevel.PRIVATE)
public class ShapeService {

    ShapeRepository repository;

    public Shape save(Shape shape) {
        return null;
    }

    public Page<Shape> getAllBy(ShapePageRequest request) {
        return null;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
