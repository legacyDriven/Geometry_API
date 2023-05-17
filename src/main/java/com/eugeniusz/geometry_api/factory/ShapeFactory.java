package com.eugeniusz.geometry_api.factory;

import com.eugeniusz.geometry_api.dto.ShapeCreateRequest;
import com.eugeniusz.geometry_api.model.Shape;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<Class<? extends ShapeCreateRequest>, ShapeCreator> creators = new HashMap<>();

    static {
        creators.put(CircleCreateRequest.class, new CircleCreator());
        creators.put(RectangleCreateRequest.class, new RectangleCreator());
        creators.put(SquareCreateRequest.class, new SquareCreator());
    }

    public static Shape createShape(ShapeCreateRequest request) {
        ShapeCreator creator = creators.get(request.getClass());
        if (creator != null) {
            return creator.createShape(request);
        } else {
            throw new IllegalArgumentException("Unsupported shape type");
        }
    }
}

