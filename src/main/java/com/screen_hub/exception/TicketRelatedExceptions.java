package com.screen_hub.exception;

public class TicketRelatedExceptions {

    // Exception for when a ticket is not found
    public static class TicketNotFoundException extends RuntimeException {
        public TicketNotFoundException(String message) {
            super(message);
        }
    }

    // Exception for invalid ticket purchase (e.g., invalid quantity)
    public static class InvalidTicketPurchaseException extends RuntimeException {
        public InvalidTicketPurchaseException(String message) {
            super(message);
        }
    }

    // Exception for when the ticket is already booked
    public static class TicketAlreadyBookedException extends RuntimeException {
        public TicketAlreadyBookedException(String message) {
            super(message);
        }
    }

    // Exception for when a ticket cannot be canceled
    public static class TicketCancellationException extends RuntimeException {
        public TicketCancellationException(String message) {
            super(message);
        }
    }
}
