package com.eugeniusz.geometry_api.api.exceptions;

import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.eugeniusz.geometry_api.api.exceptions.ServerErrorDetails.detailedServerErrorDetailsOf;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@Profile("dev")
@RestControllerAdvice
@Order(Integer.MAX_VALUE)
public class DetailedGenericExceptionHandler {

    @ExceptionHandler(Throwable.class)
    @ResponseStatus(INTERNAL_SERVER_ERROR)
    public ServerErrorDetails handleThrowable(Throwable ex) {
        return detailedServerErrorDetailsOf(ex);
    }
}
