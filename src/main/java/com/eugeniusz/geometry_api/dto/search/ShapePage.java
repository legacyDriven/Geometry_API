package com.eugeniusz.geometry_api.dto.search;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;

public record ShapePage(
        @Nullable @Schema(example = "0", description = "Page number") int pageNumber,
        @Nullable @Schema(example = "10", description = "Page size") int pageSize,
        @Nullable @Schema(example = "id", description = "Sort by field") String sortBy,
        @Nullable @Schema(example = "asc", allowableValues = {"asc", "desc"}, description = "Sort direction") String sortDirection
) {

    public static ShapePage defaultShapePageOf(int pageNumber, int pageSize, String sortBy, String sortDirection) {
        if(pageNumber < 0) pageNumber = 0;
        if(pageSize < 1) pageSize = 0;
        if(sortBy == null || sortBy.isBlank()) sortBy = "id";
        if(sortDirection == null || sortDirection.isBlank()) sortDirection = "asc";
        return new ShapePage(pageNumber, pageSize, sortBy, sortDirection);
    }


}
