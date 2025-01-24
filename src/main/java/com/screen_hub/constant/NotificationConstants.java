package com.screen_hub.constant;

import lombok.Data;

@Data
public class NotificationConstants {

    // Notification related messages
    public static final String BOOKING_CONFIRMATION = "Your booking has been confirmed.";
    public static final String MOVIE_REMINDER = "Reminder: Your movie is about to start.";
    public static final String PAYMENT_SUCCESS = "Your payment has been successfully processed.";

    // Error messages
    public static final String NOTIFICATION_FAILED = "Notification sending failed. Please try again.";

}
