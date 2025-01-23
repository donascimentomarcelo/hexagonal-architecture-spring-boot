package br.com.pdi.hexagonal.application.domain.person;

import br.com.pdi.hexagonal.application.exceptions.ValidationException;

public record Name(String value) {

    public Name {
        if (value == null) {
            throw new ValidationException("Invalid value for Name");
        }
    }
}
