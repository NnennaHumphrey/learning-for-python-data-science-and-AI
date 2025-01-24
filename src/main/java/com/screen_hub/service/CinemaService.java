package com.screen_hub.service;

import com.screen_hub.dto.CinemaDTO;

import java.util.List;
import java.util.UUID;

public interface CinemaService {


    CinemaDTO createCinema(CinemaDTO cinemaDTO);
    CinemaDTO updateCinema(UUID cinemaId, CinemaDTO cinemaDTO);
    void deleteCinema(UUID cinemaId);
    CinemaDTO getCinemaById(UUID cinemaId);
    List<CinemaDTO> getAllCinemas();
    List<CinemaDTO> getCinemasByLocation(String location);
    List<CinemaDTO> getCinemasByType(String cinemaType);
}

