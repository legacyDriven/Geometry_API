package com.eugeniusz.geometry_api.dto.search;

import com.eugeniusz.geometry_api.model.shape.ShapeType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
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

