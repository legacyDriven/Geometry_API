package com.eugeniusz.geometry_api.dto.mappers;

import com.eugeniusz.geometry_api.dto.search.filters.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SearchFilterMapper {

    SearchFilterMapper INSTANCE = Mappers.getMapper(SearchFilterMapper.class);

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

    @Mapping(target = "lengthFrom", source = "lengthFrom")
    @Mapping(target = "lengthTo", source = "lengthTo")
    @Mapping(target = "widthFrom", source = "widthFrom")
    @Mapping(target = "widthTo", source = "widthTo")
    @Mapping(target = "areaFrom", source = "areaFrom")
    @Mapping(target = "areaTo", source = "areaTo")
    @Mapping(target = "perimeterFrom", source = "perimeterFrom")
    @Mapping(target = "perimeterTo", source = "perimeterTo")
    @Mapping(target = "version", source = "version")
    @Mapping(target = "createdBy", source = "createdBy")
    @Mapping(target = "lastModifiedBy", source = "lastModifiedBy")
    @Mapping(target = "createdAt", source = "createdAt")
    @Mapping(target = "lastModifiedAt", source = "lastModifiedAt")
    RectangleFilter toRectangleFilter(ShapeRequestFilter shapeRequest);

    @Mapping(target = "sideFrom", source = "sideFrom")
    @Mapping(target = "sideTo", source = "sideTo")
    @Mapping(target = "areaFrom", source = "areaFrom")
    @Mapping(target = "areaTo", source = "areaTo")
    @Mapping(target = "perimeterFrom", source = "perimeterFrom")
    @Mapping(target = "perimeterTo", source = "perimeterTo")
    @Mapping(target = "version", source = "version")
    @Mapping(target = "createdBy", source = "createdBy")
    @Mapping(target = "lastModifiedBy", source = "lastModifiedBy")
    @Mapping(target = "createdAt", source = "createdAt")
    @Mapping(target = "lastModifiedAt", source = "lastModifiedAt")
    SquareFilter toSquareFilter(ShapeRequestFilter shapeRequest);

    @Mapping(target = "areaFrom", source = "areaFrom")
    @Mapping(target = "areaTo", source = "areaTo")
    @Mapping(target = "perimeterFrom", source = "perimeterFrom")
    @Mapping(target = "perimeterTo", source = "perimeterTo")
    @Mapping(target = "version", source = "version")
    @Mapping(target = "createdBy", source = "createdBy")
    @Mapping(target = "lastModifiedBy", source = "lastModifiedBy")
    @Mapping(target = "createdAt", source = "createdAt")
    @Mapping(target = "lastModifiedAt", source = "lastModifiedAt")
    GenericFilter toGenericFilter(ShapeRequestFilter shapeRequest);

}
