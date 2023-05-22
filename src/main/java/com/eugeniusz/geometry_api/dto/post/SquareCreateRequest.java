package com.eugeniusz.geometry_api.dto.post;

import com.eugeniusz.geometry_api.dto.post.ShapeCreateRequest;
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
public class SquareCreateRequest extends ShapeCreateRequest {

    @NotNull
    @Positive
    BigDecimal side;

}
