//package com.screen_hub.service.impl;
//
//import com.screen_hub.dto.CinemaDTO;
//import com.screen_hub.mapper.CinemaMapper;
//import com.screen_hub.model.Cinema;
//import com.screen_hub.repository.CinemaRepository;
//import com.screen_hub.service.CinemaService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.UUID;
//import java.util.stream.Collectors;
//
//@Service
//@RequiredArgsConstructor
//public class CinemaServiceImpl implements CinemaService {
//
//    private final CinemaRepository cinemaRepository;
//    private final CinemaMapper cinemaMapper;
//
//    @Override
//    public CinemaDTO createCinema(CinemaDTO cinemaDTO) {
//        Cinema cinema = cinemaMapper.toEntity(cinemaDTO);
//        Cinema savedCinema = cinemaRepository.save(cinema);
//        return cinemaMapper.toDto(savedCinema);
//    }
//
//    @Override
//    public CinemaDTO updateCinema(UUID cinemaId, CinemaDTO cinemaDTO) {
//        Cinema existingCinema = cinemaRepository.findById(cinemaId)
//                .orElseThrow(() -> new RuntimeException("Cinema not found with ID: " + cinemaId));
//        cinemaMapper.updateEntityFromDto(cinemaDTO, existingCinema);
//        Cinema updatedCinema = cinemaRepository.save(existingCinema);
//        return cinemaMapper.toDto(updatedCinema);
//    }
//
//    @Override
//    public void deleteCinema(UUID cinemaId) {
//        if (!cinemaRepository.existsById(cinemaId)) {
//            throw new RuntimeException("Cinema not found with ID: " + cinemaId);
//        }
//        cinemaRepository.deleteById(cinemaId);
//    }
//
//    @Override
//    public CinemaDTO getCinemaById(UUID cinemaId) {
//        Cinema cinema = cinemaRepository.findById(cinemaId)
//                .orElseThrow(() -> new RuntimeException("Cinema not found with ID: " + cinemaId));
//        return cinemaMapper.toDto(cinema);
//    }
//
//    @Override
//    public List<CinemaDTO> getAllCinemas() {
//        return cinemaRepository.findAll().stream()
//                .map(cinemaMapper::toDto)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public List<CinemaDTO> getCinemasByLocation(String location) {
//        return cinemaRepository.findByLocation(location).stream()
//                .map(cinemaMapper::toDto)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public List<CinemaDTO> getCinemasByType(String cinemaType) {
//        return cinemaRepository.findByCinemaType(cinemaType).stream()
//                .map(cinemaMapper::toDto)
//                .collect(Collectors.toList());
//    }
//}
