package com.screen_hub.mapper;

import com.screen_hub.dto.CinemaDTO;
import com.screen_hub.model.Cinema;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CinemaMapper {

    public Cinema toEntity(CinemaDTO cinemaDTO) {
        if (cinemaDTO == null) {
            return null;
        }

        Cinema cinema = new Cinema();
        cinema.setId(cinemaDTO.getId());
        cinema.setName(cinemaDTO.getName());
        cinema.setLocation(cinemaDTO.getLocation());
        cinema.setCinemaType(cinemaDTO.getCinemaType());
        return cinema;
    }

    public CinemaDTO toDto(Cinema cinema) {
        if (cinema == null) {
            return null;
        }

        CinemaDTO cinemaDTO = new CinemaDTO();
        cinemaDTO.setId(cinema.getId());
        cinemaDTO.setName(cinema.getName());
        cinemaDTO.setLocation(cinema.getLocation());
        cinemaDTO.setCinemaType(cinema.getCinemaType());
        cinemaDTO.setShowtimeIds(cinema.getShowtimes() != null
                ? cinema.getShowtimes().stream()
                .map(showtime -> showtime.getId())
                .collect(Collectors.toList())
                : null);
        cinemaDTO.setSeatIds(cinema.getSeats() != null
                ? cinema.getSeats().stream()
                .map(seat -> seat.getId())
                .collect(Collectors.toList())
                : null);
        return cinemaDTO;
    }

    public void updateEntityFromDto(CinemaDTO cinemaDTO, Cinema cinema) {
        if (cinemaDTO != null) {
            cinema.setName(cinemaDTO.getName());
            cinema.setLocation(cinemaDTO.getLocation());
            cinema.setCinemaType(cinemaDTO.getCinemaType());
        }
    }
}
