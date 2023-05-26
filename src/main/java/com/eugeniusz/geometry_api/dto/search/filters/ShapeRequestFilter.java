package com.eugeniusz.geometry_api.dto.search.filters;

import com.eugeniusz.geometry_api.model.shape.ShapeType;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@FieldDefaults(makeFinal = true, level = lombok.AccessLevel.PRIVATE)
public class ShapeRequestFilter {

    ShapeType type;

    BigDecimal areaFrom;

    BigDecimal areaTo;

    BigDecimal perimeterFrom;

    BigDecimal perimeterTo;

    BigDecimal radiusFrom;

    BigDecimal radiusTo;

    BigDecimal sideFrom;

    BigDecimal sideTo;

    BigDecimal widthFrom;

    BigDecimal widthTo;

    BigDecimal lengthFrom;

    BigDecimal lengthTo;

    Integer version;

    String createdBy;

    LocalDateTime createdAt;

    LocalDateTime lastModifiedAt;

    String lastModifiedBy;

    int pageNumber;

    int pageSize;

    String sortBy;

    String sortDirection;

    public Pageable toPageRequest() {
        int page = Math.max(pageNumber, 0);
        int size = pageSize > 0 ? pageSize : 10;
        String sortField = sortBy != null && !sortBy.isBlank() ? sortBy : "id";
        Sort.Direction direction = Sort.Direction.ASC;
        if (sortDirection != null && sortDirection.equalsIgnoreCase("desc")) {
            direction = Sort.Direction.DESC;
        }
        return PageRequest.of(page, size, Sort.by(direction, sortField));
    }

}
