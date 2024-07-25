package com.hackathon.StudentManagementSystem.service;

import com.hackathon.StudentManagementSystem.model.TotalSeat;

import java.time.LocalDate;
import java.util.List;

public interface TotalSeatService {

    List<TotalSeat> getTotalSeat(LocalDate date);

}
