//package com.screen_hub.service.impl;
//
//import com.screen_hub.dto.MovieDTO;
//import com.screen_hub.mapper.MovieMapper;
//import com.screen_hub.model.Movie;
//import com.screen_hub.repository.MovieRepository;
//import com.screen_hub.service.MovieService;
//import jakarta.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.UUID;
//import java.util.stream.Collectors;
//
//@Transactional
//@Service
//public class MovieServiceImpl implements MovieService {
//
//    @Autowired
//    private MovieRepository movieRepository;
//
//    @Autowired
//    private MovieMapper movieMapper;
//
//
//
//    @Override
//    public MovieDTO createMovie(MovieDTO movieDTO) {
//        Movie movie = movieMapper.toEntity(movieDTO);
//        Movie savedMovie = movieRepository.save(movie);
//        return movieMapper.toDto(savedMovie);
//    }
//
//    @Override
//    public MovieDTO updateMovie(UUID movieId, MovieDTO movieDTO) {
//        return null;
//    }
//
//    @Override
//    public void deleteMovie(UUID movieId) {
//
//        movieRepository.deleteById(movieId);
//
//    }
//
//    @Override
//    public MovieDTO getMovieById(UUID movieId) {
//        Movie movie = movieRepository.findById(movieId)
//                .orElseThrow(() -> new IllegalArgumentException("Movie not found"));
//        return movieMapper.toDto(movie);
//    }
//
//    @Override
//    public List<MovieDTO> getAllMovies() {
//        List<Movie> movies = movieRepository.findAll();
//        return movies.stream()
//                .map(movieMapper::toDto)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public List<MovieDTO> getMoviesByShowtime(LocalDateTime showtime) {
//        // Fetch movies by showtime from the repository
//        List<Movie> movies = movieRepository.findByShowtimes_Showtime(showtime);
//
//        // Map the movies to DTOs
//        return movies.stream()
//                .map(movieMapper::toDto)
//                .collect(Collectors.toList());
//    }
//}
