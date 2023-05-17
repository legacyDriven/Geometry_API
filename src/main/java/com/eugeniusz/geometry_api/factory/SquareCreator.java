package com.eugeniusz.geometry_api.factory;

public class SquareCreator implements ShapeCreator {
    @Override
    public Shape createShape(ShapeCreateRequest request) {
        SquareCreateRequest squareRequest = (SquareCreateRequest) request;
        return new Square(ShapeType.SQUARE, squareRequest.getSide());
    }
}
