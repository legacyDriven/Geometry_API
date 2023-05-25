package com.eugeniusz.geometry_api.dto.search;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class RectangleSearchRequest extends ShapeSearchRequest{

    BigDecimal lengthFrom;
    BigDecimal lengthTo;
    BigDecimal widthFrom;
    BigDecimal widthTo;
}
