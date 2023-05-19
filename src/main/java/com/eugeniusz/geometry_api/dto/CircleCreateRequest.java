package com.eugeniusz.geometry_api.dto;

import java.math.BigDecimal;

public class CircleCreateRequest extends ShapeCreateRequest {

    private BigDecimal radius;

    public CircleCreateRequest() {
    }

    public CircleCreateRequest(BigDecimal radius) {
        this.radius = radius;
    }

    public BigDecimal getRadius() {
        return radius;
    }
}
