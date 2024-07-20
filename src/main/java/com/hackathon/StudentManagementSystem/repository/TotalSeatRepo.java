package com.hackathon.StudentManagementSystem.repository;

import com.hackathon.StudentManagementSystem.model.TotalSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TotalSeatRepo extends JpaRepository<TotalSeat,String> {
}
