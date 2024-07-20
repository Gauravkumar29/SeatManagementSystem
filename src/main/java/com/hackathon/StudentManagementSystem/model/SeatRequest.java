package com.hackathon.StudentManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "seat_booking_info")
public class SeatRequest {

    @Id
    private Integer bookingId;
    private String employId;

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private int seatNumber;
    private int floorNumber;
    private String reservationStatus;
}
