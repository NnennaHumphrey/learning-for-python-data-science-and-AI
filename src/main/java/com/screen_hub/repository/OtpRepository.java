package com.screen_hub.repository;

import com.screen_hub.model.Otp;
import com.screen_hub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

public interface OtpRepository extends JpaRepository<Otp, UUID> {

    Optional<Otp> findByOtpCodeAndUser(String otpCode, User user);

    Optional<Otp> findByUser(User user);

    void OtpExpiryDateBefore(LocalDateTime expiryDate);
}
