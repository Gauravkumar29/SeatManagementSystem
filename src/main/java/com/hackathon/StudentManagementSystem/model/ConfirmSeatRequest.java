package com.hackathon.StudentManagementSystem.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ConfirmSeatRequest {
    @NotNull
    private String employId;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @NotNull
    private int seatNumber;

    @NotNull
    private int floorNumber;

    @NotNull
    private String reservationStatus;

}
