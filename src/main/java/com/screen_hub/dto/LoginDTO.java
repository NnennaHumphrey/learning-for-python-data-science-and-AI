package com.screen_hub.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginDTO {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
