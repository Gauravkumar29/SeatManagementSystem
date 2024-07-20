package com.hackathon.StudentManagementSystem.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SeatResponse {

    public String status;
    public Integer bookingId;
}
