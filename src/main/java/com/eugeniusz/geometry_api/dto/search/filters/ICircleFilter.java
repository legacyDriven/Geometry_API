package com.eugeniusz.geometry_api.dto.search.filters;

import java.math.BigDecimal;

public interface ICircleFilter extends GenericFilter {

    BigDecimal getRadiusFrom();

    BigDecimal getRadiusTo();
}
