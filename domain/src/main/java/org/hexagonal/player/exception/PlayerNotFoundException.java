package org.hexagonal.player.exception;

public class PlayerNotFoundException extends RuntimeException{

    public PlayerNotFoundException(String message) {
        super(message);
    }
}
