package com.screen_hub.dto;

import com.screen_hub.model.enums.SeatNumber;
import com.screen_hub.model.enums.SeatStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatDTO {

    private UUID id;
    private UUID cinemaId;
    private UUID showtimeId;
    private SeatNumber seatNumber;
    private SeatStatus status;
}
