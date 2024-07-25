package com.hackathon.StudentManagementSystem.repository;

import com.hackathon.StudentManagementSystem.model.TotalSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.Tuple;
import java.time.LocalDate;
import java.util.List;

public interface TotalSeatRepo extends JpaRepository<TotalSeat,String> {

    @Query(value = "SELECT ts.seat_id as seatId, ts.floor_number AS floorNumber, ts.seat_number AS seatNumber, " +
            "COALESCE(sbi.reservation_status, 'Available') AS reservationStatus " +
            "FROM total_seat ts " +
            "LEFT JOIN seat_booking_info sbi " +
            "ON ts.floor_number = sbi.floor_number " +
            "AND ts.seat_number = sbi.seat_number " +
            "AND sbi.date = :date",
            nativeQuery = true)
    List<Tuple> getAllSeatByStatus(@Param("date") LocalDate date);
}
