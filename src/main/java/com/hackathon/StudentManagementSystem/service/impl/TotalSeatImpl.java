package com.hackathon.StudentManagementSystem.service.impl;

import com.hackathon.StudentManagementSystem.model.TotalSeat;
import com.hackathon.StudentManagementSystem.repository.TotalSeatRepo;
import com.hackathon.StudentManagementSystem.service.TotalSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class TotalSeatImpl implements TotalSeatService {

    @Autowired
    TotalSeatRepo totalSeatRepo;



    public void addTotalSeat() {

        int[] floors  = {5,6,10};

        for (int floor : floors) {
            for (int seat = 1; seat <= 50; seat++) {
                TotalSeat totalSeat = new TotalSeat();
                totalSeat.setFloorNumber(floor);
                totalSeat.setSeatNumber(seat);
                totalSeatRepo.save(totalSeat);
            }
        }


        return;
    }

    @Override
    public List<TotalSeat> getTotalSeat() {

        totalSeatRepo.deleteAll();
        addTotalSeat();

        return totalSeatRepo.findAll();

    }
}
