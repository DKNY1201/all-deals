package com.alldeals.controller;

/**
 * Created by thanhhuyle on 11/17/17.
 */

import com.alldeals.domain.DomainError;
import com.alldeals.domain.DomainErrors;
import com.alldeals.exception.AccessDeniedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ControllerAdvice
public class ExceptionController {

    @Autowired
    MessageSourceAccessor messageAccessor;

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public DomainErrors handleException(MethodArgumentNotValidException exception) {
        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();

        DomainErrors errors = new DomainErrors();
        errors.setErrorType("CommentValidationError");
        for (FieldError fieldError : fieldErrors) {
            DomainError error = new DomainError(messageAccessor.getMessage(fieldError));
            errors.addError(error);
        }

        return errors;
    }

    @ExceptionHandler(value = AccessDeniedException.class)
    public String accessDenied(AccessDeniedException exception, Model model) {
        model.addAttribute("link", exception.getLink());
        return "error-forbidden";
    }

}