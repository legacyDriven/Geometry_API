package com.eugeniusz.geometry_api.dto;

import java.math.BigDecimal;

public class SquareCreateRequest extends ShapeCreateRequest {

    BigDecimal side;

    public BigDecimal getSide() {
        return this.side;
    }
}
