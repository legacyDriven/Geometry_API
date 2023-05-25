package com.eugeniusz.geometry_api.dto.search;

import com.eugeniusz.geometry_api.model.shape.ShapeType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@SuperBuilder
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public abstract class ShapeSearchRequest {
    ShapeType type;
    BigDecimal areaFrom;
    BigDecimal areaTo;
    BigDecimal perimeterFrom;
    BigDecimal perimeterTo;
    String createdBy;
    LocalDateTime createdAt;
    String lastModifiedBy;
    LocalDateTime lastModifiedAt;
    ShapePage page;

}

