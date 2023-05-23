package com.eugeniusz.geometry_api.factory.create;

import com.eugeniusz.geometry_api.dto.post.CircleCreateRequest;
import com.eugeniusz.geometry_api.dto.post.ShapeCreateRequest;
import com.eugeniusz.geometry_api.model.shape.Circle;
import com.eugeniusz.geometry_api.model.shape.Shape;

public class CircleCreator implements ShapeCreator {
    @Override
    public Shape createShape(ShapeCreateRequest request) {
        CircleCreateRequest circleRequest = (CircleCreateRequest) request;
        return new Circle(circleRequest.getRadius());
    }
}
