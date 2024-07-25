package com.hackathon.StudentManagementSystem.service.impl;

import com.hackathon.StudentManagementSystem.model.TotalSeat;
import com.hackathon.StudentManagementSystem.repository.TotalSeatRepo;
import com.hackathon.StudentManagementSystem.service.TotalSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Tuple;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TotalSeatImpl implements TotalSeatService {

    @Autowired
    TotalSeatRepo totalSeatRepo;



    public void addTotalSeat() {

        int[] floors  = {5,6,10};
        int seat_ID = 1;

        for (int floor : floors) {
            for (int seat = 1; seat <= 50; seat++) {
                TotalSeat totalSeat = new TotalSeat();
                totalSeat.setSeatId(seat_ID++);
                totalSeat.setFloorNumber(floor);
                totalSeat.setSeatNumber(seat);
                totalSeat.setReservationStatus("Available");
                totalSeatRepo.save(totalSeat);
            }
        }
    }

    @Override
    public List<TotalSeat> getTotalSeat(LocalDate date) {

        totalSeatRepo.deleteAll();
        addTotalSeat();

        List<Tuple> tuples = totalSeatRepo.getAllSeatByStatus(date);

        return tuples.stream()
                .map(tuple ->
                        new TotalSeat(
                                tuple.get("seatId", Integer.class),
                                tuple.get("seatNumber", Integer.class),
                                tuple.get("floorNumber", Integer.class),
                                tuple.get("reservationStatus", String.class)
                        )
                ).collect(Collectors.toList());
    }
}




