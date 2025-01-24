package com.screen_hub.mapper;

import com.screen_hub.dto.SeatDTO;
import com.screen_hub.model.Seat;
import org.springframework.stereotype.Component;

@Component
public class SeatMapper {

    public Seat toEntity(SeatDTO seatDTO) {
        if (seatDTO == null) {
            return null;
        }

        Seat seat = new Seat();
        seat.setId(seatDTO.getId());
        seat.setSeatNumber(seatDTO.getSeatNumber());
        seat.setStatus(seatDTO.getStatus());
        return seat;
    }

    public SeatDTO toDto(Seat seat) {
        if (seat == null) {
            return null;
        }

        SeatDTO seatDTO = new SeatDTO();
        seatDTO.setId(seat.getId());
        seatDTO.setSeatNumber(seat.getSeatNumber());
        seatDTO.setStatus(seat.getStatus());
        seatDTO.setShowtimeId(seat.getShowtime().getId());
        seatDTO.setCinemaId(seat.getCinema().getId());
        return seatDTO;
    }

    public void updateEntityFromDto(SeatDTO seatDTO, Seat seat) {
        if (seatDTO != null) {
            seat.setSeatNumber(seatDTO.getSeatNumber());
            seat.setStatus(seatDTO.getStatus());
        }
    }
}
