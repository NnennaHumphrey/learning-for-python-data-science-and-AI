package com.screen_hub.model;

import com.screen_hub.model.enums.CinemaType;
import com.screen_hub.model.enums.SeatStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "theaters")
@EntityListeners(AuditingEntityListener.class)
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "location", nullable = false)
    private String location;

    @Enumerated(EnumType.STRING)
    @Column(name = "cinema_type", nullable = false)
    private CinemaType cinemaType;

    @OneToMany(mappedBy = "cinema", cascade = CascadeType.ALL)
    @Column(name = "showtimes", nullable = false)
    private List<Showtime> showtimes;

    @OneToMany(mappedBy = "cinema", cascade = CascadeType.ALL)
    @Column(name = "seats", nullable = false)
    private List<Seat> seats;

    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @CreatedBy
    @Column(name = "created_by", nullable = false)
    private String CreatedBy;
}
