package com.eugeniusz.geometry_api.dto.search.filters;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record GenericFilter(

        BigDecimal areaFrom,
        BigDecimal areaTo,
        BigDecimal perimeterFrom,
        BigDecimal perimeterTo,
        String createdBy,
        String lastModifiedBy,
        LocalDateTime createdAt,
        LocalDateTime lastModifiedAt) {
}
