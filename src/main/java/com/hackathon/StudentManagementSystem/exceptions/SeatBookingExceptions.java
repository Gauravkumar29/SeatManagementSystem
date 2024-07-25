package com.hackathon.StudentManagementSystem.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class SeatBookingExceptions extends Exception {
    private String message;
    public SeatBookingExceptions(String message) {
        this.message = message;
    }
}
