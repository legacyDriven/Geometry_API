package com.eugeniusz.geometry_api.model.shape;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class ShapePage {

    int pageNumber = 0;

    int pageSize = 10;

//    int offset = 1;

    Sort.Direction direction = Sort.Direction.ASC;

    String sortBy = "area";
}
