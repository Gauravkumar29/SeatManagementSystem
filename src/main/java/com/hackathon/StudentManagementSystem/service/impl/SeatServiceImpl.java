package com.hackathon.StudentManagementSystem.service.impl;

import com.hackathon.StudentManagementSystem.model.ConfirmSeatRequest;
import com.hackathon.StudentManagementSystem.model.SeatRequest;
import com.hackathon.StudentManagementSystem.model.SeatResponse;
import com.hackathon.StudentManagementSystem.repository.SeatRepo;
import com.hackathon.StudentManagementSystem.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class SeatServiceImpl implements SeatService {
@Autowired
SeatRepo seatRepo;
    @Override
    public SeatResponse bookedSeatWithSeatNumber(SeatRequest seatRequest) {

       // seatRequest.setDateTime();

        SeatResponse seatResponse = new SeatResponse();
        Integer bookingId = generateBookingId();
        seatRequest.setBookingId(bookingId);
        SeatRequest result = seatRepo.checkReservation(seatRequest.getEmployId(),seatRequest.getDate());
        if(result == null){
            seatRepo.save(seatRequest);
            seatResponse.setStatus(seatRequest.getReservationStatus());
            seatResponse.setBookingId(bookingId);
        }
        else {
           seatResponse.setStatus("Already Reserved");
        }

        return seatResponse;
    }

    @Override
    public List<SeatRequest> getBookedSeat(String emplyId, String floorNumber, String seatNumber, LocalDate date) {

        List<SeatRequest> list = new ArrayList<>();

        if(floorNumber == null && emplyId ==null)
            return seatRepo.findReservationForNextTwodays();

        List<SeatRequest>  emplyHistory = seatRepo.getHistory(emplyId);

        if(emplyId != null && emplyHistory != null) {
            return emplyHistory;
        }

        //        if(!(result == null)){
//            //list.add(result);
//            return list;
//        }


       return seatRepo.checkSeat(floorNumber, seatNumber, date);
    }

    @Override
    public SeatResponse confirmSeat(ConfirmSeatRequest confirmSeatRequest) {

        var result = seatRepo.findByBookingId(confirmSeatRequest.getBookingId());
        SeatResponse seatResponse =new SeatResponse();
        if(result != null){

            result.setReservationStatus(confirmSeatRequest.getReservationStatus());
            seatRepo.save(result);
            seatResponse.setBookingId(result.getBookingId());
            seatResponse.setStatus(confirmSeatRequest.getReservationStatus());
        }
        else
            seatResponse.setStatus("Seat not booked yet");

        return seatResponse;
    }

    @Override
    public String deleteUser(SeatRequest seatRequest) {

        if(seatRepo.findByBookingId(seatRequest.getBookingId()) != null){
//            seatRepo.deleteByBookingId(seatRequest.getBookingId());
            seatRepo.delete(seatRequest);
            return "user deleted";
        }

        return  "user does not exist" ;
    }

    public static Integer generateBookingId() {
        UUID uusid;
        int hashCode;

        do{
            hashCode =UUID.randomUUID().hashCode();
        }while (hashCode == Integer.MIN_VALUE);

        return Math.abs(hashCode);
    }


//    @Override
//    public List<SeatRequest> getAllBookedSeat(String emplyId) {
//            return seatRepo.findAll();
//
//
//    }


}
