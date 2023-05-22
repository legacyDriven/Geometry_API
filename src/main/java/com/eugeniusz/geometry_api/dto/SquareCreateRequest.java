package com.eugeniusz.geometry_api.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SquareCreateRequest extends ShapeCreateRequest {

    @NotEmpty
    BigDecimal side;

}
