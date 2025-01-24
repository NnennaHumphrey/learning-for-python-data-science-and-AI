package com.screen_hub.repository;

import com.screen_hub.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CinemaRepository extends JpaRepository<Cinema, UUID> {

    List<Cinema> findByLocation(String location);
    List<Cinema> findByCinemaType(String cinemaType);

}
