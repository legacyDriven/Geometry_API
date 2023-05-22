package com.eugeniusz.geometry_api.api;

import com.eugeniusz.geometry_api.model.shape.ShapePage;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

//@Builder
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class ShapePageRequest {

    ShapePage shapePage;

}
