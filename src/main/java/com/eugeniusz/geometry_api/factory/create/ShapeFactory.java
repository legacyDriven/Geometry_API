package com.eugeniusz.geometry_api.factory.create;

import com.eugeniusz.geometry_api.dto.post.CircleCreateRequest;
import com.eugeniusz.geometry_api.dto.post.RectangleCreateRequest;
import com.eugeniusz.geometry_api.dto.post.ShapeCreateRequest;
import com.eugeniusz.geometry_api.dto.post.SquareCreateRequest;
import com.eugeniusz.geometry_api.model.shape.Shape;

import java.util.HashMap;
import java.util.Map;


public class ShapeFactory {
    private static final Map<Class<? extends ShapeCreateRequest>, ShapeCreator> creators = new HashMap<>();

    static {
        creators.put(CircleCreateRequest.class, new CircleCreator());
        creators.put(SquareCreateRequest.class, new SquareCreator());
        creators.put(RectangleCreateRequest.class, new RectangleCreator());
    }

    public static Shape createShape(ShapeCreateRequest request) {
        ShapeCreator creator = creators.get(request.getClass());
        if (creator != null) {
            return creator.createShape(request);
        } else {
            throw new IllegalArgumentException("Unsupported shape type");
        }
    }

    public static Shape updateShape(ShapeCreateRequest request, Shape shape) {
        ShapeCreator creator = creators.get(request.getClass());
        if (creator != null) {
            return creator.updateShape(request, shape);
        } else {
            throw new IllegalArgumentException("Unsupported shape type");
        }
    }
}

