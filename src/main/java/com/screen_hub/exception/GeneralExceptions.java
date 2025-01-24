package com.screen_hub.exception;

public class GeneralExceptions {

    // Exception for any general errors in the system
    public static class GeneralSystemException extends RuntimeException {
        public GeneralSystemException(String message) {
            super(message);
        }
    }

    // Exception for invalid API requests
    public static class InvalidRequestException extends RuntimeException {
        public InvalidRequestException(String message) {
            super(message);
        }
    }

    // Exception for when an operation is forbidden
    public static class ForbiddenOperationException extends RuntimeException {
        public ForbiddenOperationException(String message) {
            super(message);
        }
    }

    // Exception for when a conflict occurs (e.g., duplicate records)
    public static class ConflictException extends RuntimeException {
        public ConflictException(String message) {
            super(message);
        }
    }

    // Exception for when a resource is not found
    public static class ResourceNotFoundException extends RuntimeException {
        public ResourceNotFoundException(String message) {
            super(message);
        }
    }
}
