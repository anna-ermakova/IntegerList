package org.example;

public class ElementNotFoundException extends RuntimeException {
    public ElementNotFoundException() {
        super();
    }

    public ElementNotFoundException(String massage) {
        super(massage);
    }
}