package com.alldeals.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thanhhuyle on 11/17/17.
 */
public class DomainErrors {
    private String errorType;
    private List<DomainError> errors = new ArrayList<>();

    public List<DomainError> getErrors() {
        return errors;
    }

    public void setErrors(List<DomainError> errors) {
        this.errors = errors;
    }

    public void addError(DomainError error) {
        errors.add(error);
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }
}
