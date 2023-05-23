package com.eugeniusz.geometry_api.factory.create;

import com.eugeniusz.geometry_api.dto.post.ShapeCreateRequest;
import com.eugeniusz.geometry_api.dto.post.SquareCreateRequest;
import com.eugeniusz.geometry_api.factory.create.ShapeCreator;
import com.eugeniusz.geometry_api.model.shape.Shape;
import com.eugeniusz.geometry_api.model.shape.Square;

public class SquareCreator implements ShapeCreator {
    @Override
    public Shape createShape(ShapeCreateRequest request) {
        SquareCreateRequest squareRequest = (SquareCreateRequest) request;
        return new Square(squareRequest.getSide());
    }
}
