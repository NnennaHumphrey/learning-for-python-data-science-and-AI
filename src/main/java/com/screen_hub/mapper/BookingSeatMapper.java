//package com.screen_hub.mapper;
//
//import org.springframework.stereotype.Component;
//
//@Component
//public class BookingSeatMapper {
//
//    public BookingSeatDTO toDTO(BookingSeat bookingSeat) {
//        return new BookingSeatDTO(
//                bookingSeat.getId(),
//                bookingSeat.getBooking().getId(),
//                bookingSeat.getSeat().getId()
//        );
//    }
//
//    public BookingSeat toEntity(BookingSeatDTO dto) {
//        BookingSeat bookingSeat = new BookingSeat();
//        bookingSeat.setId(dto.getId());
//        // Booking and Seat should be fetched from the database
//        return bookingSeat;
//    }
//}
