package com.hackathon.StudentManagementSystem.service;

import com.hackathon.StudentManagementSystem.exceptions.SeatBookingExceptions;
import com.hackathon.StudentManagementSystem.model.ConfirmSeatRequest;
import com.hackathon.StudentManagementSystem.model.SeatRequest;
import com.hackathon.StudentManagementSystem.model.SeatResponse;
import com.hackathon.StudentManagementSystem.payload.SeatBookingDTO;

import java.time.LocalDate;
import java.util.List;

public interface SeatService {

    SeatResponse bookedSeatWithSeatNumber(SeatRequest seatRequest);
    List<SeatRequest> getBookedSeat(String employId, String floorNumber, String seatNumber, LocalDate date) throws SeatBookingExceptions;
    SeatResponse confirmSeat(ConfirmSeatRequest confirmSeatRequest);
    String deleteUser(SeatRequest seatRequest);
}
