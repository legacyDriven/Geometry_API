package com.eugeniusz.geometry_api.dto.search.filters;

import com.eugeniusz.geometry_api.dto.validators.EnumNamePattern;
import com.eugeniusz.geometry_api.model.shape.ShapeType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ShapeRequestFilter (
        @NotNull(message = "Shape type cannot be null")
        @EnumNamePattern(regexp = "CIRCLE|SQUARE|RECTANGLE")
        ShapeType type,
        @PositiveOrZero(message = "Area value cannot be negative")
        BigDecimal areaFrom,
        @Positive(message = "Area upper bound value cannot be negative or zero")
        BigDecimal areaTo,
        @PositiveOrZero(message = "Perimeter value cannot be negative")
        BigDecimal perimeterFrom,
        @Positive(message = "Perimeter upper bound value cannot be negative or zero")
        BigDecimal perimeterTo,
        @Positive(message = "Radius value cannot be negative or zero")
        BigDecimal radiusFrom,
        @Positive(message = "Radius upper bound value cannot be negative or zero")
        BigDecimal radiusTo,
        @Positive(message = "Side value cannot be negative or zero")
        BigDecimal sideFrom,
        @Positive(message = "Side upper bound value cannot be negative or zero")
        BigDecimal sideTo,
        @Positive(message = "Width value cannot be negative or zero")
        BigDecimal widthFrom,
        @Positive(message = "Width upper bound value cannot be negative or zero")
        BigDecimal widthTo,
        @Positive(message = "Length value cannot be negative or zero")
        BigDecimal lengthFrom,
        @Positive(message = "Length upper bound value cannot be negative or zero")
        BigDecimal lengthTo,
        String createdBy,
        @PastOrPresent(message = "Created at date cannot be in the future")
        LocalDateTime createdAt,
        @PastOrPresent(message = "Last modified at date cannot be in the future")
        LocalDateTime lastModifiedAt,
        String lastModifiedBy,
        @PositiveOrZero(message = "Page number value cannot be negative")
        int pageNumber,
        @Positive(message = "Page size value cannot be negative or zero")
        int pageSize,
        String sortBy,
        String sortDirection) {

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
