package com.eugeniusz.geometry_api.factory.create;

import com.eugeniusz.geometry_api.dto.post.CircleCreateRequest;
import com.eugeniusz.geometry_api.dto.post.RectangleCreateRequest;
import com.eugeniusz.geometry_api.dto.post.ShapeCreateRequest;
import com.eugeniusz.geometry_api.dto.post.SquareCreateRequest;
import com.eugeniusz.geometry_api.model.shape.Shape;
import lombok.experimental.FieldDefaults;

import java.util.HashMap;
import java.util.Map;


@FieldDefaults(makeFinal = true, level = lombok.AccessLevel.PRIVATE)
public class ShapeFactory {

    static String EXCEPTION_MESSAGE = "Unsupported shape type";

    static Map<Class<? extends ShapeCreateRequest>, ShapeCreator> creators =
            Map.of(
                    CircleCreateRequest.class, new CircleCreator(),
                    SquareCreateRequest.class, new SquareCreator(),
                    RectangleCreateRequest.class, new RectangleCreator()
                    );

    public static Shape createShape(ShapeCreateRequest request) {
        ShapeCreator creator = creators.get(request.getClass());
        if (creator != null) {
            return creator.createShape(request);
        } else {
            throw new IllegalArgumentException(EXCEPTION_MESSAGE);
        }
    }

    public static Shape updateShape(ShapeCreateRequest request, Shape shape) {
        ShapeCreator creator = creators.get(request.getClass());
        if (creator != null) {
            return creator.updateShape(request, shape);
        } else {
            throw new IllegalArgumentException(EXCEPTION_MESSAGE);
        }
    }
}

