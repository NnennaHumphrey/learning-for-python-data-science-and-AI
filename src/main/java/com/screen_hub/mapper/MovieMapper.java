package com.screen_hub.mapper;

import com.screen_hub.dto.MovieDTO;
import com.screen_hub.model.Movie;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class MovieMapper {

    // Convert DTO to Entity
    public Movie toEntity(MovieDTO movieDTO) {
        if (movieDTO == null) {
            return null; // Handle null case
        }

        Movie movie = new Movie();
        if (movieDTO.getId() != null) {
            movie.setId(UUID.fromString(String.valueOf(movieDTO.getId()))); // Convert String to UUID
        }
        movie.setTitle(movieDTO.getTitle());
        movie.setGenre(movieDTO.getGenre());
        movie.setDuration(movieDTO.getDuration());
        movie.setReleaseDate(movieDTO.getReleaseDate());
        movie.setDirector(movieDTO.getDirector());
        movie.setCastMembers(movieDTO.getCastMembers());
        return movie;
    }

    // Convert Entity to DTO
    public MovieDTO toDto(Movie movie) {
        if (movie == null) {
            return null; // Handle null case
        }

        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setId(UUID.fromString(movie.getId().toString())); // Convert UUID to String
        movieDTO.setTitle(movie.getTitle());
        movieDTO.setGenre(movie.getGenre());
        movieDTO.setDuration(movie.getDuration());
        movieDTO.setReleaseDate(movie.getReleaseDate());
        movieDTO.setDirector(movie.getDirector());
        movieDTO.setCastMembers(movie.getCastMembers());
        return movieDTO;
    }
}
