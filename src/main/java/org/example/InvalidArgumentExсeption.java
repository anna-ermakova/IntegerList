package org.example;

public class InvalidArgumentExсeption extends RuntimeException {
    public InvalidArgumentExсeption() {
        super();
    }
    public InvalidArgumentExсeption(String massage) {
        super(massage);
    }
}