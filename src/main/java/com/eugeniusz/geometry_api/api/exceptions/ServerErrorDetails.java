package com.eugeniusz.geometry_api.api.exceptions;

public record ServerErrorDetails() {

    public static ServerErrorDetails serverErrorDetailsOf(Throwable ex){
        return null;
    }

    public static ServerErrorDetails detailedServerErrorDetailsOf(Throwable ex){
        return null;
    }
}
