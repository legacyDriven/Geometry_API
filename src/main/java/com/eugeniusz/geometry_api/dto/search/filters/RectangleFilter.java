package com.eugeniusz.geometry_api.dto.search.filters;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Builder
@FieldDefaults(makeFinal = true, level = lombok.AccessLevel.PRIVATE)
public class RectangleFilter {//implements ShapeRequest {

    BigDecimal lengthFrom;

    BigDecimal lengthTo;

    BigDecimal widthFrom;

    BigDecimal widthTo;

    BigDecimal areaFrom;

    BigDecimal areaTo;

    BigDecimal perimeterFrom;

    BigDecimal perimeterTo;

    String createdBy;

    String lastModifiedBy;

    LocalDateTime createdAt;

    LocalDateTime lastModifiedAt;

}
