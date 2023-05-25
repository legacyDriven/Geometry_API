package com.eugeniusz.geometry_api.dto.search;

import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Getter
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class CircleSearchRequest extends ShapeSearchRequest{

    BigDecimal radiusFrom;
    BigDecimal radiusTo;

}
