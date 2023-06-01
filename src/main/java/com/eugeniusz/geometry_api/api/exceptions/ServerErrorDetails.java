package com.eugeniusz.geometry_api.api.exceptions;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NonNull;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public record ServerErrorDetails(
        @NonNull @Schema(example = "0x5000xxx", description = "HTTP status code") String err,
        @NonNull @Schema(example = "SERVER_ERROR") String code,
        @NonNull @Schema(example = "User friendly non technical business message") String message,
        @NonNull @Schema(example = "cause", description = "stacktrace") List<ExceptionDetails> exceptions) {
    public record ExceptionDetails(
           @JsonProperty("message") String message,
           @JsonInclude(JsonInclude.Include.NON_NULL) @JsonProperty("innerException") String innerException) {
    }
    public static ServerErrorDetails serverErrorDetailsOf(Throwable ex){
        return new ServerErrorDetails(
                "0x5000xxx",
                "INTERNAL_SERVER_ERROR",
                "Internal server error occurred, please retry or try again later",
                Collections.singletonList(new ExceptionDetails(ex.getLocalizedMessage(), null)));
    }

    public static ServerErrorDetails detailedServerErrorDetailsOf(Throwable ex){
        return new ServerErrorDetails(
                "0x5000xxx",
                "INTERNAL_SERVER_ERROR",
                "Internal server error occurred, please retry or try again later",
                getExceptionDetails(ex));
    }

    private static List<ExceptionDetails> getExceptionDetails(Throwable ex) {
        List<ExceptionDetails> result = new ArrayList<>();
        Throwable cause = ex;
        while (cause != null) {
            String message = cause.getLocalizedMessage();
            String stackTrace = ExceptionUtils.getStackTrace(cause);
            ExceptionDetails exceptionDetails = new ExceptionDetails(message, stackTrace);
            result.add(exceptionDetails);
            cause = cause.getCause();
        }
        Collections.reverse(result);
        return result;
    }
}
