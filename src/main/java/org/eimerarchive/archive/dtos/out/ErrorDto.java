package org.eimerarchive.archive.dtos.out;

public record ErrorDto(String error) {

    public static ErrorDto create(String error) {
        return new ErrorDto(error);
    }
}