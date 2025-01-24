package com.screen_hub.model.enums;

import lombok.Getter;

@Getter
public enum SeatNumber {
    A1("A", 1), A2("A", 2), A3("A", 3), A4("A", 4), A5("A", 5),
    A6("A", 6), A7("A", 7), A8("A", 8), A9("A", 9), A10("A", 10),
    A11("A", 11), A12("A", 12), A13("A", 13), A14("A", 14), A15("A", 15),
    A16("A", 16), A17("A", 17), A18("A", 18), A19("A", 19), A20("A", 20),
    A21("A", 21), A22("A", 22), A23("A", 23), A24("A", 24), A25("A", 25),
    A26("A", 26), A27("A", 27), A28("A", 28), A29("A", 29), A30("A", 30),

    // Viewing Hall B
    B1("B", 1), B2("B", 2), B3("B", 3), B4("B", 4), B5("B", 5),
    B6("B", 6), B7("B", 7), B8("B", 8), B9("B", 9), B10("B", 10),
    B11("B", 11), B12("B", 12), B13("B", 13), B14("B", 14), B15("B", 15),
    B16("B", 16), B17("B", 17), B18("B", 18), B19("B", 19), B20("B", 20),
    B21("B", 21), B22("B", 22), B23("B", 23), B24("B", 24), B25("B", 25),
    B26("B", 26), B27("B", 27), B28("B", 28), B29("B", 29), B30("B", 30),

    // Viewing Hall C
    C1("C", 1), C2("C", 2), C3("C", 3), C4("C", 4), C5("C", 5),
    C6("C", 6), C7("C", 7), C8("C", 8), C9("C", 9), C10("C", 10),
    C11("C", 11), C12("C", 12), C13("C", 13), C14("C", 14), C15("C", 15),
    C16("C", 16), C17("C", 17), C18("C", 18), C19("C", 19), C20("C", 20),
    C21("C", 21), C22("C", 22), C23("C", 23), C24("C", 24), C25("C", 25),
    C26("C", 26), C27("C", 27), C28("C", 28), C29("C", 29), C30("C", 30); // Add up to C30

    private final String viewingHall;
    private final int number;

    SeatNumber(String viewingHall, int number) {
        this.viewingHall = viewingHall;
        this.number = number;
    }

}
