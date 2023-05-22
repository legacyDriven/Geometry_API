package com.eugeniusz.geometry_api.factory;

import com.eugeniusz.geometry_api.dto.ShapeCreateRequest;
import com.eugeniusz.geometry_api.model.shape.Shape;

public interface ShapeCreator {
    Shape createShape(ShapeCreateRequest request);
}
