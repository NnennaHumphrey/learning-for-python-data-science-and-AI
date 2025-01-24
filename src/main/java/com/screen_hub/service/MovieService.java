package com.screen_hub.service;

import com.screen_hub.dto.MovieDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface MovieService {

    MovieDTO createMovie(MovieDTO movieDTO);

    MovieDTO updateMovie(UUID movieId, MovieDTO movieDTO);

    void deleteMovie(UUID movieId);

    MovieDTO getMovieById(UUID movieId);

    List<MovieDTO> getAllMovies();

    List<MovieDTO> getMoviesByShowtime(LocalDateTime showtime);
}
