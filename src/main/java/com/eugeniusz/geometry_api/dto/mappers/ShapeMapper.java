package com.eugeniusz.geometry_api.dto.mappers;

import com.eugeniusz.geometry_api.dto.search.filters.CircleFilter;
import com.eugeniusz.geometry_api.dto.search.filters.ShapeRequestFilter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ShapeMapper {

    ShapeMapper INSTANCE = Mappers.getMapper(ShapeMapper.class);

    @Mapping(target = "radiusFrom", source = "radiusFrom")
    @Mapping(target = "radiusTo", source = "radiusTo")
    @Mapping(target = "areaFrom", source = "areaFrom")
    @Mapping(target = "areaTo", source = "areaTo")
    @Mapping(target = "perimeterFrom", source = "perimeterFrom")
    @Mapping(target = "perimeterTo", source = "perimeterTo")
    @Mapping(target = "version", source = "version")
    @Mapping(target = "createdBy", source = "createdBy")
    @Mapping(target = "lastModifiedBy", source = "lastModifiedBy")
    @Mapping(target = "createdAt", source = "createdAt")
    @Mapping(target = "lastModifiedAt", source = "lastModifiedAt")

    CircleFilter toCircleFilter(ShapeRequestFilter shapeRequest);

    // Dodaj kolejne metody mapujące dla innych specyfikacji

}
