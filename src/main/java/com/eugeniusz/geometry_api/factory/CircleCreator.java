package com.eugeniusz.geometry_api.factory;

public class CircleCreator implements ShapeCreator {
    @Override
    public Shape createShape(ShapeCreateRequest request) {
        CircleCreateRequest circleRequest = (CircleCreateRequest) request;
        return new Circle(ShapeType.CIRCLE, circleRequest.getRadius());
    }
}
