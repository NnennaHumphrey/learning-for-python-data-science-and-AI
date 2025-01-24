package com.screen_hub.service;

import com.screen_hub.dto.SeatDTO;

import java.util.List;
import java.util.UUID;

public interface SeatService {

    SeatDTO createSeat(SeatDTO seatDTO);
    SeatDTO updateSeat(UUID seatId, SeatDTO seatDTO);
    void deleteSeat(UUID seatId);
    SeatDTO getSeatById(UUID seatId);
    List<SeatDTO> getAllSeats();
    List<SeatDTO> getSeatsByShowtime(UUID showtimeId);
    List<SeatDTO> getSeatsByCinema(UUID cinemaId);
}
