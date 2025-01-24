package com.screen_hub.exception;

public class ShowtimeRelatedExceptions {

    // Exception for showtime not found
    public static class ShowtimeNotFoundException extends RuntimeException {
        public ShowtimeNotFoundException(String message) {
            super(message);
        }
    }

    // Exception for showtime conflict (duplicate showtimes)
    public static class ShowtimeConflictException extends RuntimeException {
        public ShowtimeConflictException(String message) {
            super(message);
        }
    }

    // Exception for invalid showtime (time or date issues)
    public static class InvalidShowtimeException extends RuntimeException {
        public InvalidShowtimeException(String message) {
            super(message);
        }
    }

    // Exception for when the requested showtime is not available
    public static class ShowtimeNotAvailableException extends RuntimeException {
        public ShowtimeNotAvailableException(String message) {
            super(message);
        }
    }

    // Exception for expired showtime booking
    public static class ShowtimeBookingExpiredException extends RuntimeException {
        public ShowtimeBookingExpiredException(String message) {
            super(message);
        }
    }
}

