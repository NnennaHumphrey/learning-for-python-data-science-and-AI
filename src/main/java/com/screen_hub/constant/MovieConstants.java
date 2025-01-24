package com.screen_hub.constant;

import lombok.Data;

@Data
public class MovieConstants {

    // Movie related messages
    public static final String MOVIE_ADDED = "Movie added successfully.";
    public static final String MOVIE_UPDATED = "Movie details updated successfully.";
    public static final String MOVIE_DELETED = "Movie deleted successfully.";
    public static final String MOVIE_NOT_FOUND = "Movie not found.";

    // Movie statuses
    public static final String MOVIE_NOW_SHOWING = "Now Showing";
    public static final String MOVIE_COMING_SOON = "Coming Soon";
    public static final String MOVIE_ARCHIVED = "Archived";
}
