package br.com.santander.service.exception;

import br.com.santander.service.exception.BusinessException;

public class NotFoundException extends BusinessException {

    private static final long serialVersionUID = 1L;

    public NotFoundException() {
        super("Resource not found.");
    }

}