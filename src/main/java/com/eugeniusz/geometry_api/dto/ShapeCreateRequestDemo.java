package com.eugeniusz.geometry_api.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.IOException;
import java.math.BigDecimal;

class ShapeCreateRequestDemo {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerSubtypes(
                new NamedType(CircleCreateRequest.class, "CIRCLE"),
                new NamedType(RectangleCreateRequest.class, "RECTANGLE"),
                new NamedType(SquareCreateRequest.class, "SQUARE")
        );

        String json = "{\"type\":\"CIRCLE\",\"radius\":5.0}";
        ShapeCreateRequest shapeCreateRequest = objectMapper.readValue(json, ShapeCreateRequest.class);

        if (shapeCreateRequest != null) {
            shapeCreateRequest.process();
        }
    }

    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.PROPERTY,
            property = "type"
    )
    @JsonSubTypes({
            @JsonSubTypes.Type(value = CircleCreateRequest.class, name = "CIRCLE"),
            @JsonSubTypes.Type(value = RectangleCreateRequest.class, name = "RECTANGLE"),
            @JsonSubTypes.Type(value = SquareCreateRequest.class, name = "SQUARE")
    })
    public static abstract class ShapeCreateRequest {
        public abstract void process();
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public static class CircleCreateRequest extends ShapeCreateRequest {
        private BigDecimal radius;

        @Override
        public void process() {
            System.out.println("Processing CircleCreateRequest");
            // Operacje specyficzne dla CircleCreateRequest
        }
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public static class RectangleCreateRequest extends ShapeCreateRequest {
        private BigDecimal length;
        private BigDecimal width;

        @Override
        public void process() {
            System.out.println("Processing RectangleCreateRequest");
            // Operacje specyficzne dla RectangleCreateRequest
        }
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public static class SquareCreateRequest extends ShapeCreateRequest {
        private BigDecimal sideLength;

        @Override
        public void process() {
            System.out.println("Processing SquareCreateRequest");
            // Operacje specyficzne dla SquareCreateRequest
        }
    }
}
