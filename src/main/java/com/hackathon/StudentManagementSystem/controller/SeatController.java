package com.hackathon.StudentManagementSystem.controller;


import com.hackathon.StudentManagementSystem.model.ConfirmSeatRequest;
import com.hackathon.StudentManagementSystem.model.SeatRequest;
import com.hackathon.StudentManagementSystem.model.SeatResponse;
import com.hackathon.StudentManagementSystem.model.TotalSeat;
import com.hackathon.StudentManagementSystem.service.SeatService;
import com.hackathon.StudentManagementSystem.service.TotalSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/workspot/desk")
public class SeatController {

    @Autowired
    SeatService seatService;

    @Autowired
    TotalSeatService totalSeatService;

    @PostMapping("seat-booking")
    public ResponseEntity<SeatResponse> bookedSeat(@RequestBody SeatRequest seatRequest){
        SeatResponse seatResponse = seatService.bookedSeatWithSeatNumber(seatRequest);
        return new ResponseEntity<>(seatResponse, HttpStatus.OK);
    }

    @GetMapping("/deskHistory")
    public ResponseEntity<List<SeatRequest>> getReservedSeat(
            @RequestParam(value = "employId", required = false) String employId,
            @RequestParam(value = "floorNumber", required = false) String floorNumber,
            @RequestParam(value = "seatNumber", required = false) String seatNumber,
            @RequestParam(value = "date", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {

        List<SeatRequest> list =seatService.getBookedSeat(employId, floorNumber, seatNumber, date);
        if(list.isEmpty())
            return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/total-seat")
    public ResponseEntity<List<TotalSeat>> getTotalSeat(
            @RequestParam(value = "date", required = true) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
    ) {
        return new ResponseEntity<>(totalSeatService.getTotalSeat(date), HttpStatus.OK);
    }

    @PutMapping("confirm-seat")
    public ResponseEntity<SeatResponse> confirmSeat(@RequestBody ConfirmSeatRequest confirmSeatRequest){
        SeatResponse seatResponse = seatService.confirmSeat(confirmSeatRequest);
        return new ResponseEntity<>(seatResponse, HttpStatus.OK);
    }

//api for delete user
    @PostMapping("delete-user")
    public ResponseEntity<String> deleteUser(@RequestBody SeatRequest seatRequest){
        String resp =  seatService.deleteUser(seatRequest);
        return new ResponseEntity<>( resp, HttpStatus.OK);
    }


}
