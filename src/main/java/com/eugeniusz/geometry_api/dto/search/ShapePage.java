package com.eugeniusz.geometry_api.dto.search;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public record ShapePage(
        @Nullable @Schema(example = "0", description = "Page number") int pageNumber,
        @Nullable @Schema(example = "10", description = "Page size") int pageSize,
        @Nullable @Schema(example = "id", description = "Sort by field") String sortBy,
        @Nullable @Schema(example = "asc", allowableValues = {"asc", "desc"}, description = "Sort direction") String sortDirection
) {
}
