package com.eugeniusz.geometry_api.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class CircleCreateRequest extends ShapeCreateRequest {

    @NotEmpty
    private BigDecimal radius;

}
