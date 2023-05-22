package com.eugeniusz.geometry_api.dto.update;

import com.eugeniusz.geometry_api.model.shape.ShapeType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = lombok.AccessLevel.PRIVATE)
public abstract class ShapeUpdateRequest {
    ShapeType shapeType;

    Long shapeId;

}

