package com.eugeniusz.geometry_api.dto.update;

import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

import static com.eugeniusz.geometry_api.model.shape.ShapeType.RECTANGLE;

@Getter
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class RectangleUpdateRequest extends ShapeUpdateRequest {

    BigDecimal length;
    BigDecimal width;

    public RectangleUpdateRequest(Long shapeId, BigDecimal length, BigDecimal width) {
        super(RECTANGLE, shapeId);
        this.length = length;
        this.width = width;
    }
}