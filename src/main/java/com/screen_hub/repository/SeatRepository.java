package com.screen_hub.repository;

import com.screen_hub.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SeatRepository  extends JpaRepository<Seat, UUID> {
    List<Seat> findByShowtimeId(UUID showtimeId);
}
