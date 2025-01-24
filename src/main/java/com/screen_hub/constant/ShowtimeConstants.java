package com.screen_hub.constant;

public class ShowtimeConstants {


    private ShowtimeConstants() {}

    // Success messages
    public static final String SHOWTIME_CREATED = "Showtime successfully created.";
    public static final String SHOWTIME_UPDATED = "Showtime details updated successfully.";
    public static final String SHOWTIME_DELETED = "Showtime successfully deleted.";
    public static final String SHOWTIME_SCHEDULED = "Showtime scheduled successfully.";

    // Error messages
    public static final String SHOWTIME_NOT_FOUND = "Showtime not found.";
    public static final String SHOWTIME_ALREADY_EXISTS = "A showtime already exists for the given movie at this time.";
    public static final String INVALID_SHOWTIME = "The specified showtime is invalid.";
    public static final String SHOWTIME_CONFLICT = "There is a conflict with the requested showtime.";

    // Status codes for showtime operations
    public static final String SHOWTIME_ALREADY_BOOKED = "The showtime has already been booked by another user.";
    public static final String SHOWTIME_NOT_AVAILABLE = "The requested showtime is not available.";
    public static final String SHOWTIME_TIME_EXPIRED = "The time for booking has expired.";

    // Method to retrieve success messages based on status code
    public static String getMessageForStatus(UserConstants.StatusCode statusCode) {
        switch (statusCode) {
            case CREATED:
                return SHOWTIME_CREATED;
            case OK:
                return SHOWTIME_SCHEDULED;
            case NO_CONTENT:
                return SHOWTIME_DELETED;
            case INTERNAL_SERVER_ERROR:
                return "An unexpected error occurred while processing the showtime. Please try again.";
            case CONFLICT:
                return SHOWTIME_ALREADY_EXISTS;
            case NOT_FOUND:
                return SHOWTIME_NOT_FOUND;
            case BAD_REQUEST:
                return INVALID_SHOWTIME;
            default:
                throw new IllegalArgumentException("Unrecognized status code for showtime");
        }
    }

    // Method to retrieve error messages based on error code
    public static String getErrorMessage(String errorCode) {
        switch (errorCode) {
            case "SHOWTIME_NOT_FOUND":
                return SHOWTIME_NOT_FOUND;
            case "SHOWTIME_ALREADY_EXISTS":
                return SHOWTIME_ALREADY_EXISTS;
            case "SHOWTIME_NOT_AVAILABLE":
                return SHOWTIME_NOT_AVAILABLE;
            case "SHOWTIME_CONFLICT":
                return SHOWTIME_CONFLICT;
            case "SHOWTIME_TIME_EXPIRED":
                return SHOWTIME_TIME_EXPIRED;
            default:
                return "An unknown error occurred while managing the showtime.";
        }
    }
}
