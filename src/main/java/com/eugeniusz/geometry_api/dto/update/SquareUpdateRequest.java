package com.eugeniusz.geometry_api.dto.update;

import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

import static com.eugeniusz.geometry_api.model.shape.ShapeType.SQUARE;

@Getter
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class SquareUpdateRequest extends ShapeUpdateRequest{

    BigDecimal side;

    public SquareUpdateRequest(Long shapeId, BigDecimal side) {
        super(SQUARE, shapeId);
        this.side = side;
    }
}
