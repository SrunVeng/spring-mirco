package com.example.employee_service.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class FieldAlreadyExistsException extends RuntimeException {

    private String fieldName;
    private String fieldValue;

    public FieldAlreadyExistsException(String fieldName, String fieldValue) {
        super(String.format("%s already exists with value: '%s'", fieldName, fieldValue));
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    // Getters for the fields (optional)
    public String getFieldName() {
        return fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }
}
