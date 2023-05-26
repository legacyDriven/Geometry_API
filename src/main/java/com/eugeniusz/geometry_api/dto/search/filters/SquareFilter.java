package com.eugeniusz.geometry_api.dto.search.filters;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SquareFilter (
        BigDecimal sideFrom,
        BigDecimal sideTo,
        BigDecimal areaFrom,
        BigDecimal areaTo,
        BigDecimal perimeterFrom,
        BigDecimal perimeterTo,
        Integer version,
        String createdBy,
        String lastModifiedBy,
        LocalDateTime createdAt,
        LocalDateTime lastModifiedAt) {

}
