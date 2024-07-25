package com.hackathon.StudentManagementSystem.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatBookingDTO {

    @NotNull(message = "Missing Emp Id")
    private String employId;

    @NotNull(message = "Missing Name")
    private String name;

    @NotNull(message = "Missing date")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "date should be 2024-07-25 format")
    private LocalDate date;

    @NotNull(message = "Missing Seat Number")
    private int seatNumber;

    @NotNull(message = "Missing Floor Number")
    private int floorNumber;

    @NotNull(message = "Missing reservation status")
    private String reservationStatus;
}