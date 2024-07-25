package com.hackathon.StudentManagementSystem.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.hackathon.StudentManagementSystem.model.ConfirmSeatRequest;
import com.hackathon.StudentManagementSystem.model.SeatRequest;
import com.hackathon.StudentManagementSystem.model.SeatResponse;
import com.hackathon.StudentManagementSystem.repository.SeatRepo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {SeatServiceImpl.class})
@ExtendWith(SpringExtension.class)
class SeatServiceImplTest {
    @MockBean
    private SeatRepo seatRepo;

    @Autowired
    private SeatServiceImpl seatServiceImpl;

    /**
     * Method under test:
     * {@link SeatServiceImpl#bookedSeatWithSeatNumber(SeatRequest)}
     */
    @Test
    void testBookedSeatWithSeatNumber() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);
        when(seatRepo.checkReservation(Mockito.<String>any(), Mockito.<LocalDate>any())).thenReturn(seatRequest);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act
        SeatResponse actualBookedSeatWithSeatNumberResult = seatServiceImpl.bookedSeatWithSeatNumber(seatRequest2);

        // Assert
        verify(seatRepo).checkReservation(eq("42"), isA(LocalDate.class));
        assertEquals("Already Reserved", actualBookedSeatWithSeatNumberResult.getStatus());
        assertNull(actualBookedSeatWithSeatNumberResult.getBookingId());
    }

    /**
     * Method under test:
     * {@link SeatServiceImpl#getBookedSeat(String, String, String, LocalDate)}
     */
    @Test
    void testGetBookedSeat() {
        // Arrange
        ArrayList<SeatRequest> seatRequestList = new ArrayList<>();
        when(seatRepo.getHistory(Mockito.<String>any())).thenReturn(seatRequestList);

        // Act
        List<SeatRequest> actualBookedSeat = seatServiceImpl.getBookedSeat("42", "42", "42", LocalDate.of(1970, 1, 1));

        // Assert
        verify(seatRepo).getHistory(eq("42"));
        assertTrue(actualBookedSeat.isEmpty());
        assertSame(seatRequestList, actualBookedSeat);
    }

    /**
     * Method under test:
     * {@link SeatServiceImpl#getBookedSeat(String, String, String, LocalDate)}
     */
    @Test
    void testGetBookedSeat2() {
        // Arrange
        ArrayList<SeatRequest> seatRequestList = new ArrayList<>();
        when(seatRepo.checkSeat(Mockito.<String>any(), Mockito.<String>any(), Mockito.<LocalDate>any()))
                .thenReturn(seatRequestList);
        when(seatRepo.getHistory(Mockito.<String>any())).thenReturn(new ArrayList<>());

        // Act
        List<SeatRequest> actualBookedSeat = seatServiceImpl.getBookedSeat(null, "42", "42", LocalDate.of(1970, 1, 1));

        // Assert
        verify(seatRepo).checkSeat(eq("42"), eq("42"), isA(LocalDate.class));
        verify(seatRepo).getHistory(isNull());
        assertTrue(actualBookedSeat.isEmpty());
        assertSame(seatRequestList, actualBookedSeat);
    }

    /**
     * Method under test:
     * {@link SeatServiceImpl#getBookedSeat(String, String, String, LocalDate)}
     */
    @Test
    void testGetBookedSeat3() {
        // Arrange
        ArrayList<SeatRequest> seatRequestList = new ArrayList<>();
        when(seatRepo.findReservationForNextTwodays()).thenReturn(seatRequestList);

        // Act
        List<SeatRequest> actualBookedSeat = seatServiceImpl.getBookedSeat(null, null, "42", LocalDate.of(1970, 1, 1));

        // Assert
        verify(seatRepo).findReservationForNextTwodays();
        assertTrue(actualBookedSeat.isEmpty());
        assertSame(seatRequestList, actualBookedSeat);
    }

    /**
     * Method under test:
     * {@link SeatServiceImpl#getBookedSeat(String, String, String, LocalDate)}
     */
    @Test
    void testGetBookedSeat4() {
        // Arrange
        ArrayList<SeatRequest> seatRequestList = new ArrayList<>();
        when(seatRepo.getHistory(Mockito.<String>any())).thenReturn(seatRequestList);

        // Act
        List<SeatRequest> actualBookedSeat = seatServiceImpl.getBookedSeat("42", null, "42", LocalDate.of(1970, 1, 1));

        // Assert
        verify(seatRepo).getHistory(eq("42"));
        assertSame(seatRequestList, actualBookedSeat);
    }

    /**
     * Method under test: {@link SeatServiceImpl#confirmSeat(ConfirmSeatRequest)}
     */
//    @Test
//    void testConfirmSeat() {
//        // Arrange
//        SeatRequest seatRequest = new SeatRequest();
//        seatRequest.setBookingId(1);
//        seatRequest.setDate(LocalDate.of(1970, 1, 1));
//        seatRequest.setEmployId("42");
//        seatRequest.setFloorNumber(10);
//        seatRequest.setName("Name");
//        seatRequest.setReservationStatus("Reservation Status");
//        seatRequest.setSeatNumber(10);
//
//        SeatRequest seatRequest2 = new SeatRequest();
//        seatRequest2.setBookingId(1);
//        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
//        seatRequest2.setEmployId("42");
//        seatRequest2.setFloorNumber(10);
//        seatRequest2.setName("Name");
//        seatRequest2.setReservationStatus("Reservation Status");
//        seatRequest2.setSeatNumber(10);
//        when(seatRepo.save(Mockito.<SeatRequest>any())).thenReturn(seatRequest2);
//        when(seatRepo.findByBookingId(Mockito.<Integer>any())).thenReturn(seatRequest);
//
//        // Act
//        SeatResponse actualConfirmSeatResult = seatServiceImpl.confirmSeat(new ConfirmSeatRequest());
//
//        // Assert
//        verify(seatRepo).findByBookingId(isNull());
//        verify(seatRepo).save(isA(SeatRequest.class));
//        assertNull(actualConfirmSeatResult.getStatus());
//        assertEquals(1, actualConfirmSeatResult.getBookingId().intValue());
//    }

    /**
     * Method under test: {@link SeatServiceImpl#deleteUser(SeatRequest)}
     */
    @Test
    void testDeleteUser() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);
        doNothing().when(seatRepo).delete(Mockito.<SeatRequest>any());
        when(seatRepo.findByBookingId(Mockito.<Integer>any())).thenReturn(seatRequest);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act
        String actualDeleteUserResult = seatServiceImpl.deleteUser(seatRequest2);

        // Assert
        verify(seatRepo).findByBookingId(eq(1));
        verify(seatRepo).delete(isA(SeatRequest.class));
        assertEquals("user deleted", actualDeleteUserResult);
    }

    /**
     * Method under test: {@link SeatServiceImpl#generateBookingId()}
     */
    @Test
    void testGenerateBookingId() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        SeatServiceImpl.generateBookingId();
    }
}
