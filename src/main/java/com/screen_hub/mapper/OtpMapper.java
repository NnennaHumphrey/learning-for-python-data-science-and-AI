package com.screen_hub.mapper;

import com.screen_hub.dto.OtpDTO;
import com.screen_hub.model.Otp;
import org.springframework.stereotype.Component;

@Component
public class OtpMapper {

    public Otp toEntity(OtpDTO otpDTO) {
        if (otpDTO == null) {
            return null; // Handle null case if needed
        }

        return Otp.builder()
                .otpCode(otpDTO.getOtp())
                .build();
    }

    public OtpDTO toDto(Otp otp) {
        if (otp == null) {
            return null; // Handle null case if needed
        }

        OtpDTO otpDTO = new OtpDTO();
        otpDTO.setOtp(otp.getOtpCode());
        return otpDTO;
    }
}
