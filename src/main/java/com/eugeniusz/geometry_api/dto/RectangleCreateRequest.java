package com.eugeniusz.geometry_api.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class RectangleCreateRequest extends ShapeCreateRequest {
    @NotEmpty
    BigDecimal length;

    @NotEmpty
    BigDecimal width;
}
