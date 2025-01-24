package com.screen_hub.constant;

import lombok.Data;

@Data
public class CinemaConstants {

    // Cinema related messages
    public static final String CINEMA_ADDED = "Cinema added successfully.";
    public static final String CINEMA_UPDATED = "Cinema details updated successfully.";
    public static final String CINEMA_DELETED = "Cinema deleted successfully.";
    public static final String CINEMA_NOT_FOUND = "Cinema not found.";

    // Cinema types
    public static final String STANDARD_CINEMA = "Standard";
    public static final String IMAX_CINEMA = "IMAX";
    public static final String DOLBY_CINEMA = "Dolby";
}
