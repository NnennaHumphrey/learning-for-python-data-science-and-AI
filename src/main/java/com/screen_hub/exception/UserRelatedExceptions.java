package com.screen_hub.exception;

public class UserRelatedExceptions {

    // Exception for when a user is not found
    public static class UserNotFoundException extends RuntimeException {
        public UserNotFoundException(String message) {
            super(message);
        }
    }

    // Exception for duplicate username
    public static class UsernameTakenException extends RuntimeException {
        public UsernameTakenException(String message) {
            super(message);
        }
    }

    // Exception for invalid login credentials
    public static class InvalidCredentialsException extends RuntimeException {
        public InvalidCredentialsException(String message) {
            super(message);
        }
    }

    // Exception for unauthorized access
    public static class UnauthorizedAccessException extends RuntimeException {
        public UnauthorizedAccessException(String message) {
            super(message);
        }
    }

    // Exception for when the user is not verified
    public static class UserNotVerifiedException extends RuntimeException {
        public UserNotVerifiedException(String message) {
            super(message);
        }
    }
}
