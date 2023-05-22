package com.eugeniusz.geometry_api.factory;

import com.eugeniusz.geometry_api.dto.post.RectangleCreateRequest;
import com.eugeniusz.geometry_api.dto.post.ShapeCreateRequest;
import com.eugeniusz.geometry_api.model.shape.Rectangle;
import com.eugeniusz.geometry_api.model.shape.Shape;

public class RectangleCreator implements ShapeCreator  {

    @Override
    public Shape createShape(ShapeCreateRequest request) {
        RectangleCreateRequest rectangleRequest = (RectangleCreateRequest) request;
        return new Rectangle(rectangleRequest.getLength(), rectangleRequest.getWidth());
    }

}
