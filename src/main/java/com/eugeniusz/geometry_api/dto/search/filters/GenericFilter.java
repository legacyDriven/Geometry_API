package com.eugeniusz.geometry_api.dto.search.filters;

import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface GenericFilter {

    Integer getVersion();

    String getCreatedBy();

    String getLastModifiedBy();

    LocalDateTime getCreatedAt();

    LocalDateTime getLastModifiedAt();

    BigDecimal getAreaFrom();

    BigDecimal getAreaTo();

    BigDecimal getPerimeterFrom();

    BigDecimal getPerimeterTo();

}
