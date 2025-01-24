package com.screen_hub.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
public class MovieDTO {

    private UUID id;

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Genre is required")
    private String genre;

    @NotNull(message = "Duration is required")
    private int duration;

    @NotNull(message = "Release date is required")
    private LocalDate releaseDate;

    @NotBlank(message = "Director is required")
    private String director;

    @NotNull(message = "Cast members list cannot be null")
    private List<String> castMembers;

}
