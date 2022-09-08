package com.forlizzi.springboot.mvc.crud.example.exception;

// THREE: handles user exceptions in invoice search for non-existent id
public class InvoiceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvoiceNotFoundException() {
        super();
    }

    public InvoiceNotFoundException(String customMessage) {
        super(customMessage);
    }
}
