package com.screen_hub.service;

import com.screen_hub.dto.LoginDTO;
import com.screen_hub.dto.RegistrationDTO;

public interface AuthService {

    void registerUser(RegistrationDTO registrationDTO);

    String loginUser(LoginDTO loginDTO);

    void logout();
}
