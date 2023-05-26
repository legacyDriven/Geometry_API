package com.eugeniusz.geometry_api.dto.search.filters;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RectangleFilter {

    BigDecimal lengthFrom;

    BigDecimal lengthTo;

    BigDecimal widthFrom;

    BigDecimal widthTo;

    BigDecimal areaFrom;

    BigDecimal areaTo;

    BigDecimal perimeterFrom;

    BigDecimal perimeterTo;

    Integer version;

    String createdBy;

    String lastModifiedBy;

    LocalDateTime createdAt;

    LocalDateTime lastModifiedAt;

}
