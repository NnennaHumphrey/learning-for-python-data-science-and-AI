package com.screen_hub.dto;

import com.screen_hub.model.enums.CinemaType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CinemaDTO {

    private UUID id;
    private String name;
    private String location;
    private CinemaType cinemaType;
    private List<UUID> showtimeIds;
    private List<UUID> seatIds;
}
