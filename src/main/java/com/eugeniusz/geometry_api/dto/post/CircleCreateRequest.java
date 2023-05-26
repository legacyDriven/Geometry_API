package com.eugeniusz.geometry_api.dto.post;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CircleCreateRequest extends ShapeCreateRequest {

    @NotNull
    @Positive
    @Schema(example = "1.0", description = "Radius of circle")
    private BigDecimal radius;

}
