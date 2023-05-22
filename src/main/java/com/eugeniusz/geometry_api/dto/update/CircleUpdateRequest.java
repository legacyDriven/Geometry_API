package com.eugeniusz.geometry_api.dto.update;

import com.eugeniusz.geometry_api.model.shape.ShapeType;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Getter
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class CircleUpdateRequest extends ShapeUpdateRequest{

    BigDecimal radius;

    public CircleUpdateRequest(Long shapeId, BigDecimal radius) {
        super(ShapeType.CIRCLE, shapeId);
        this.radius = radius;
    }
}
