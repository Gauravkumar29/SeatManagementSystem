package com.hackathon.StudentManagementSystem.service.impl;

import com.hackathon.StudentManagementSystem.exceptions.SeatBookingExceptions;
import com.hackathon.StudentManagementSystem.model.ConfirmSeatRequest;
import com.hackathon.StudentManagementSystem.model.SeatRequest;
import com.hackathon.StudentManagementSystem.model.SeatResponse;
import com.hackathon.StudentManagementSystem.repository.SeatRepo;
import com.hackathon.StudentManagementSystem.service.SeatService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SeatServiceImpl implements SeatService {
  @Autowired SeatRepo seatRepo;

  private static Integer generateBookingId() {
    int hashCode;
    do {
      hashCode = UUID.randomUUID().hashCode();
    } while (hashCode == Integer.MIN_VALUE);

    return Math.abs(hashCode);
  }

  @Override
  public SeatResponse bookedSeatWithSeatNumber(SeatRequest seatRequest) {

    SeatResponse seatResponse = new SeatResponse();
    Integer bookingId = generateBookingId();
    seatRequest.setBookingId(bookingId);
    SeatRequest result =
        seatRepo.checkReservation(seatRequest.getEmployId(), seatRequest.getDate());
    if (result == null) {
      seatRepo.save(seatRequest);
      seatResponse.setStatus(seatRequest.getReservationStatus());
      seatResponse.setBookingId(bookingId);
    } else {
      seatResponse.setStatus("Already Reserved");
    }
    return seatResponse;
  }

  @Override
  public List<SeatRequest> getBookedSeat(
      String employId, String floorNumber, String seatNumber, LocalDate date) throws SeatBookingExceptions {

    if (employId != null) return seatRepo.getHistory(employId);

    if (Objects.isNull(floorNumber) && Objects.nonNull(seatNumber)
        || Objects.isNull(seatNumber) && Objects.nonNull(floorNumber)) {
      log.error("Seat Number and floor number should be passed together for a desk identity");
    throw new SeatBookingExceptions("Seat Number and floor number should be passed together for a desk identity");
    }

    if(Objects.isNull(date)) {
        return seatRepo.findReservationForNextTwodays();
    } else {
        return seatRepo.checkSeat(floorNumber, seatNumber, date);
    }
  }

  @Override
  public SeatResponse confirmSeat(ConfirmSeatRequest confirmSeatRequest) {
    log.info("Enter confirmSeat method, confirmSeatRequest: {}", confirmSeatRequest);
    var result =
        seatRepo.checkBookingStatus(
            confirmSeatRequest.getEmployId(),
            confirmSeatRequest.getFloorNumber(),
            confirmSeatRequest.getSeatNumber(),
            confirmSeatRequest.getDate());
    SeatResponse seatResponse = new SeatResponse();
    if (result != null) {

      result.setReservationStatus(confirmSeatRequest.getReservationStatus());
      seatRepo.save(result);
      seatResponse.setBookingId(result.getBookingId());
      seatResponse.setStatus(confirmSeatRequest.getReservationStatus());
    } else seatResponse.setStatus("Seat not booked yet");

    return seatResponse;
  }

  @Override
  public String deleteUser(SeatRequest seatRequest) {

    if (seatRepo.findByBookingId(seatRequest.getBookingId()) != null) {
      seatRepo.delete(seatRequest);
      return "user deleted";
    }
    return "user does not exist";
  }
}
