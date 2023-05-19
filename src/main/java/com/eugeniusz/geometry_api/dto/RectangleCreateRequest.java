package com.eugeniusz.geometry_api.dto;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class RectangleCreateRequest extends ShapeCreateRequest {
    BigDecimal length;

    BigDecimal width;
}
