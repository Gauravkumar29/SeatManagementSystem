package com.hackathon.StudentManagementSystem.repository;

import com.hackathon.StudentManagementSystem.model.SeatRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface SeatRepo extends JpaRepository<SeatRequest,String> {


    @Query(value = "SELECT * FROM seat_booking_info WHERE date BETWEEN CURDATE() and DATE_ADD(CURDATE(), INTERVAL 2 DAY) and reservation_status = 'Booked'",
            nativeQuery = true)
    public List<SeatRequest> findReservationForNextTwodays();

    @Query(value = "SELECT * FROM seat_booking_info WHERE employ_id = :employId and date = :date",
            nativeQuery = true)
    public SeatRequest checkReservation(String employId, LocalDate date);

    @Query(value = "SELECT * FROM seat_booking_info WHERE floor_number = :floorNumber and seat_number = :seatNumber and date = :date",
            nativeQuery = true)
    public List<SeatRequest> checkSeat(String floorNumber, String seatNumber, LocalDate date);

    @Query(value = "SELECT * FROM seat_booking_info WHERE employ_id = :employId",
            nativeQuery = true)
    public  List<SeatRequest>  getHistory(String employId);


    SeatRequest findByBookingId(Integer bookingId);

    @Query(value = "SELECT * FROM seat_booking_info WHERE reservation_status = :booked and date = :date",
            nativeQuery = true)
    List<SeatRequest> getAllUserByStatus(String booked, LocalDate date);

    @Query(value = "SELECT * FROM seat_booking_info WHERE employ_id = :employId and floor_number = :floorNumber and seat_number = :seatNumber and date = :date",
            nativeQuery = true)
    SeatRequest checkBookingStatus(String employId, int floorNumber, int seatNumber, LocalDate date);
}
