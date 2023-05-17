package com.eugeniusz.geometry_api.factory;

public class RectangleCreator implements ShapeCreator {
    @Override
    public Shape createShape(ShapeCreateRequest request) {
        RectangleCreateRequest rectangleRequest = (RectangleCreateRequest) request;
        return new Rectangle(ShapeType.RECTANGLE, rectangleRequest.getLength(), rectangleRequest.getWidth());
    }
}
