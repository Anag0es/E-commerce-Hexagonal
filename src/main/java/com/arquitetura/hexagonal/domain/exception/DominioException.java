package com.arquitetura.hexagonal.domain.exception;

public class DominioException {

    private String message;

    public DominioException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
