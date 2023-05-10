package com.eugeniusz.geometry_api.api.exceptions;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NonNull;

public record ErrorDetails(
        @NonNull @Schema(example = "0x4000001") String err,
        @NonNull @Schema(example = "MALFORMED_JSON") String code,
        @NonNull @Schema(example = "The payload is malformed") String message) {

    public static ErrorDetails errorDetailsOf(String err, String code, String message) {
        return new ErrorDetails(err, code, message);
    }

}
