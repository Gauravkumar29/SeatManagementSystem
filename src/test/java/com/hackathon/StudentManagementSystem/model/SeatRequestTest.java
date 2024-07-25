package com.hackathon.StudentManagementSystem.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class SeatRequestTest {
    /**
     * Methods under test:
     * <ul>
     *   <li>{@link SeatRequest#equals(Object)}
     *   <li>{@link SeatRequest#hashCode()}
     * </ul>
     */
    @Test
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act and Assert
        assertEquals(seatRequest, seatRequest2);
        int expectedHashCodeResult = seatRequest.hashCode();
        assertEquals(expectedHashCodeResult, seatRequest2.hashCode());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link SeatRequest#equals(Object)}
     *   <li>{@link SeatRequest#hashCode()}
     * </ul>
     */
    @Test
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(null);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(null);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act and Assert
        assertEquals(seatRequest, seatRequest2);
        int expectedHashCodeResult = seatRequest.hashCode();
        assertEquals(expectedHashCodeResult, seatRequest2.hashCode());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link SeatRequest#equals(Object)}
     *   <li>{@link SeatRequest#hashCode()}
     * </ul>
     */
    @Test
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(null);
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(null);
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act and Assert
        assertEquals(seatRequest, seatRequest2);
        int expectedHashCodeResult = seatRequest.hashCode();
        assertEquals(expectedHashCodeResult, seatRequest2.hashCode());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link SeatRequest#equals(Object)}
     *   <li>{@link SeatRequest#hashCode()}
     * </ul>
     */
    @Test
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual4() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId(null);
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId(null);
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act and Assert
        assertEquals(seatRequest, seatRequest2);
        int expectedHashCodeResult = seatRequest.hashCode();
        assertEquals(expectedHashCodeResult, seatRequest2.hashCode());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link SeatRequest#equals(Object)}
     *   <li>{@link SeatRequest#hashCode()}
     * </ul>
     */
    @Test
    void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);

        // Act and Assert
        assertEquals(seatRequest, seatRequest);
        int expectedHashCodeResult = seatRequest.hashCode();
        assertEquals(expectedHashCodeResult, seatRequest.hashCode());
    }

    /**
     * Method under test: {@link SeatRequest#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(2);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(seatRequest, seatRequest2);
    }

    /**
     * Method under test: {@link SeatRequest#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(null);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(seatRequest, seatRequest2);
    }

    /**
     * Method under test: {@link SeatRequest#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(LocalDate.now());
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(seatRequest, seatRequest2);
    }

    /**
     * Method under test: {@link SeatRequest#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(null);
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(seatRequest, seatRequest2);
    }

    /**
     * Method under test: {@link SeatRequest#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId("Name");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(seatRequest, seatRequest2);
    }

    /**
     * Method under test: {@link SeatRequest#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId(null);
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(seatRequest, seatRequest2);
    }

    /**
     * Method under test: {@link SeatRequest#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(1);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(seatRequest, seatRequest2);
    }

    /**
     * Method under test: {@link SeatRequest#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("42");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(seatRequest, seatRequest2);
    }

    /**
     * Method under test: {@link SeatRequest#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName(null);
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(seatRequest, seatRequest2);
    }

    /**
     * Method under test: {@link SeatRequest#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("42");
        seatRequest.setSeatNumber(10);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(seatRequest, seatRequest2);
    }

    /**
     * Method under test: {@link SeatRequest#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus(null);
        seatRequest.setSeatNumber(10);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(seatRequest, seatRequest2);
    }

    /**
     * Method under test: {@link SeatRequest#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(1);

        SeatRequest seatRequest2 = new SeatRequest();
        seatRequest2.setBookingId(1);
        seatRequest2.setDate(LocalDate.of(1970, 1, 1));
        seatRequest2.setEmployId("42");
        seatRequest2.setFloorNumber(10);
        seatRequest2.setName("Name");
        seatRequest2.setReservationStatus("Reservation Status");
        seatRequest2.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(seatRequest, seatRequest2);
    }

    /**
     * Method under test: {@link SeatRequest#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsNull_thenReturnNotEqual() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(seatRequest, null);
    }

    /**
     * Method under test: {@link SeatRequest#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
        // Arrange
        SeatRequest seatRequest = new SeatRequest();
        seatRequest.setBookingId(1);
        seatRequest.setDate(LocalDate.of(1970, 1, 1));
        seatRequest.setEmployId("42");
        seatRequest.setFloorNumber(10);
        seatRequest.setName("Name");
        seatRequest.setReservationStatus("Reservation Status");
        seatRequest.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(seatRequest, "Different type to SeatRequest");
    }

    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        SeatRequest actualSeatRequest = new SeatRequest();
        actualSeatRequest.setBookingId(1);
        LocalDate date = LocalDate.of(1970, 1, 1);
        actualSeatRequest.setDate(date);
        actualSeatRequest.setEmployId("42");
        actualSeatRequest.setFloorNumber(10);
        actualSeatRequest.setName("Name");
        actualSeatRequest.setReservationStatus("Reservation Status");
        actualSeatRequest.setSeatNumber(10);
        String actualToStringResult = actualSeatRequest.toString();
        Integer actualBookingId = actualSeatRequest.getBookingId();
        LocalDate actualDate = actualSeatRequest.getDate();
        String actualEmployId = actualSeatRequest.getEmployId();
        int actualFloorNumber = actualSeatRequest.getFloorNumber();
        String actualName = actualSeatRequest.getName();
        String actualReservationStatus = actualSeatRequest.getReservationStatus();
        int actualSeatNumber = actualSeatRequest.getSeatNumber();

        // Assert that nothing has changed
        assertEquals("1970-01-01", actualDate.toString());
        assertEquals("42", actualEmployId);
        assertEquals("Name", actualName);
        assertEquals("Reservation Status", actualReservationStatus);
        assertEquals("SeatRequest(bookingId=1, employId=42, name=Name, date=1970-01-01, seatNumber=10, floorNumber=10,"
                + " reservationStatus=Reservation Status)", actualToStringResult);
        assertEquals(1, actualBookingId.intValue());
        assertEquals(10, actualFloorNumber);
        assertEquals(10, actualSeatNumber);
        assertSame(date, actualDate);
    }


    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        SeatRequest actualSeatRequest = new SeatRequest(1, "42", "Name", LocalDate.of(1970, 1, 1), 10, 10,
                "Reservation Status");
        actualSeatRequest.setBookingId(1);
        LocalDate date = LocalDate.of(1970, 1, 1);
        actualSeatRequest.setDate(date);
        actualSeatRequest.setEmployId("42");
        actualSeatRequest.setFloorNumber(10);
        actualSeatRequest.setName("Name");
        actualSeatRequest.setReservationStatus("Reservation Status");
        actualSeatRequest.setSeatNumber(10);
        String actualToStringResult = actualSeatRequest.toString();
        Integer actualBookingId = actualSeatRequest.getBookingId();
        LocalDate actualDate = actualSeatRequest.getDate();
        String actualEmployId = actualSeatRequest.getEmployId();
        int actualFloorNumber = actualSeatRequest.getFloorNumber();
        String actualName = actualSeatRequest.getName();
        String actualReservationStatus = actualSeatRequest.getReservationStatus();
        int actualSeatNumber = actualSeatRequest.getSeatNumber();

        // Assert that nothing has changed
        assertEquals("1970-01-01", actualDate.toString());
        assertEquals("42", actualEmployId);
        assertEquals("Name", actualName);
        assertEquals("Reservation Status", actualReservationStatus);
        assertEquals("SeatRequest(bookingId=1, employId=42, name=Name, date=1970-01-01, seatNumber=10, floorNumber=10,"
                + " reservationStatus=Reservation Status)", actualToStringResult);
        assertEquals(1, actualBookingId.intValue());
        assertEquals(10, actualFloorNumber);
        assertEquals(10, actualSeatNumber);
        assertSame(date, actualDate);
    }
}
