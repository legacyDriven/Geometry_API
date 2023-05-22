package com.eugeniusz.geometry_api.factory;

import com.eugeniusz.geometry_api.dto.ShapeCreateRequest;
import com.eugeniusz.geometry_api.dto.SquareCreateRequest;
import com.eugeniusz.geometry_api.model.shape.Shape;
import com.eugeniusz.geometry_api.model.shape.Square;

public class SquareCreator implements ShapeCreator {
    @Override
    public Shape createShape(ShapeCreateRequest request) {
        SquareCreateRequest squareRequest = (SquareCreateRequest) request;
        return new Square(squareRequest.getSide());
    }
}
