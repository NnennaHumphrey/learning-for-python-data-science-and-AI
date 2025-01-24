package com.screen_hub.mapper;

import com.screen_hub.dto.RegistrationDTO;
import com.screen_hub.model.User;
import org.springframework.stereotype.Component;

@Component
public class RegistrationMapper {

    public User toEntity(RegistrationDTO registrationDTO) {
        if (registrationDTO == null) {
            return null; // Handle null case if needed
        }

        User user = new User();
        user.setFirstName(registrationDTO.getFirstName());
        user.setLastName(registrationDTO.getLastName());
        user.setUsername(registrationDTO.getUsername());
        user.setPhoneNumber(registrationDTO.getPhoneNumber());
        user.setEmail(registrationDTO.getEmail());
        user.setPassword(registrationDTO.getPassword());
        return user;
    }
}
