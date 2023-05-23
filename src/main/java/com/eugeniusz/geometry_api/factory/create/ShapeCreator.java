package com.eugeniusz.geometry_api.factory.create;

import com.eugeniusz.geometry_api.dto.post.ShapeCreateRequest;
import com.eugeniusz.geometry_api.model.shape.Shape;

public interface ShapeCreator {
    Shape createShape(ShapeCreateRequest request);
}
