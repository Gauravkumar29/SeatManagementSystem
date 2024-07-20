package com.hackathon.StudentManagementSystem.service;

import com.hackathon.StudentManagementSystem.model.ConfirmSeatRequest;
import com.hackathon.StudentManagementSystem.model.SeatRequest;
import com.hackathon.StudentManagementSystem.model.SeatResponse;

import java.time.LocalDate;
import java.util.List;

public interface SeatService {

    SeatResponse bookedSeatWithSeatNumber(SeatRequest seatRequest);

    List<SeatRequest> getBookedSeat(String employId, String floorNumber, String seatNumber, LocalDate date);

//    SeatRequest getBookedSeat(String emplyId);

    SeatResponse confirmSeat(ConfirmSeatRequest confirmSeatRequest);

    String deleteUser(SeatRequest seatRequest);
}
