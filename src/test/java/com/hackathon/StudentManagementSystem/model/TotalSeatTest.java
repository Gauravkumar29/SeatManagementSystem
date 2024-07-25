package com.hackathon.StudentManagementSystem.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class TotalSeatTest {

    @Test
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
        // Arrange
        TotalSeat totalSeat = new TotalSeat();
        totalSeat.setFloorNumber(10);
        totalSeat.setSeatId(1);
        totalSeat.setSeatNumber(10);

        TotalSeat totalSeat2 = new TotalSeat();
        totalSeat2.setFloorNumber(10);
        totalSeat2.setSeatId(1);
        totalSeat2.setSeatNumber(10);

        // Act and Assert
        assertEquals(totalSeat, totalSeat2);
        int expectedHashCodeResult = totalSeat.hashCode();
        assertEquals(expectedHashCodeResult, totalSeat2.hashCode());
    }

    @Test
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
        // Arrange
        TotalSeat.TotalSeatBuilder totalSeatBuilder = mock(TotalSeat.TotalSeatBuilder.class);
        when(totalSeatBuilder.floorNumber(anyInt())).thenReturn(TotalSeat.builder());
        TotalSeat buildResult = totalSeatBuilder.floorNumber(10).seatId(1).seatNumber(10).build();
        buildResult.setFloorNumber(10);
        buildResult.setSeatId(1);
        buildResult.setSeatNumber(10);

        TotalSeat totalSeat = new TotalSeat();
        totalSeat.setFloorNumber(10);
        totalSeat.setSeatId(1);
        totalSeat.setSeatNumber(10);

        // Act and Assert
        assertEquals(buildResult, totalSeat);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, totalSeat.hashCode());
    }


    @Test
    void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
        // Arrange
        TotalSeat totalSeat = new TotalSeat();
        totalSeat.setFloorNumber(10);
        totalSeat.setSeatId(1);
        totalSeat.setSeatNumber(10);

        // Act and Assert
        assertEquals(totalSeat, totalSeat);
        int expectedHashCodeResult = totalSeat.hashCode();
        assertEquals(expectedHashCodeResult, totalSeat.hashCode());
    }

    /**
     * Method under test: {@link TotalSeat#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
        // Arrange
        TotalSeat totalSeat = new TotalSeat();
        totalSeat.setFloorNumber(1);
        totalSeat.setSeatId(1);
        totalSeat.setSeatNumber(10);

        TotalSeat totalSeat2 = new TotalSeat();
        totalSeat2.setFloorNumber(10);
        totalSeat2.setSeatId(1);
        totalSeat2.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(totalSeat, totalSeat2);
    }

    /**
     * Method under test: {@link TotalSeat#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
        // Arrange
        TotalSeat totalSeat = new TotalSeat();
        totalSeat.setFloorNumber(10);
        totalSeat.setSeatId(2);
        totalSeat.setSeatNumber(10);

        TotalSeat totalSeat2 = new TotalSeat();
        totalSeat2.setFloorNumber(10);
        totalSeat2.setSeatId(1);
        totalSeat2.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(totalSeat, totalSeat2);
    }

    /**
     * Method under test: {@link TotalSeat#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
        // Arrange
        TotalSeat totalSeat = new TotalSeat();
        totalSeat.setFloorNumber(10);
        totalSeat.setSeatId(1);
        totalSeat.setSeatNumber(1);

        TotalSeat totalSeat2 = new TotalSeat();
        totalSeat2.setFloorNumber(10);
        totalSeat2.setSeatId(1);
        totalSeat2.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(totalSeat, totalSeat2);
    }

    /**
     * Method under test: {@link TotalSeat#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsNull_thenReturnNotEqual() {
        // Arrange
        TotalSeat totalSeat = new TotalSeat();
        totalSeat.setFloorNumber(10);
        totalSeat.setSeatId(1);
        totalSeat.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(totalSeat, null);
    }

    /**
     * Method under test: {@link TotalSeat#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
        // Arrange
        TotalSeat totalSeat = new TotalSeat();
        totalSeat.setFloorNumber(10);
        totalSeat.setSeatId(1);
        totalSeat.setSeatNumber(10);

        // Act and Assert
        assertNotEquals(totalSeat, "Different type to TotalSeat");
    }


//    @Test
//    void testGettersAndSetters() {
//        // Arrange and Act
//        TotalSeat actualTotalSeat = new TotalSeat();
//        actualTotalSeat.setFloorNumber(10);
//        actualTotalSeat.setSeatId(1);
//        actualTotalSeat.setSeatNumber(10);
//        String actualToStringResult = actualTotalSeat.toString();
//        int actualFloorNumber = actualTotalSeat.getFloorNumber();
//        int actualSeatId = actualTotalSeat.getSeatId();
//
//        // Assert that nothing has changed
//        assertEquals("TotalSeat(seatId=1, seatNumber=10, floorNumber=10)", actualToStringResult);
//        assertEquals(1, actualSeatId);
//        assertEquals(10, actualFloorNumber);
//        assertEquals(10, actualTotalSeat.getSeatNumber());
//    }


//    @Test
//    void testGettersAndSetters2() {
//        // Arrange and Act
//        TotalSeat actualTotalSeat = new TotalSeat(1, 10, 10,"Booked");
//        actualTotalSeat.setFloorNumber(10);
//        actualTotalSeat.setSeatId(1);
//        actualTotalSeat.setSeatNumber(10);
//        actualTotalSeat.setReservationStatus("Booked");
//        String actualToStringResult = actualTotalSeat.toString();
//        int actualFloorNumber = actualTotalSeat.getFloorNumber();
//        int actualSeatId = actualTotalSeat.getSeatId();
//
//        // Assert that nothing has changed
//        assertEquals("TotalSeat(seatId=1, seatNumber=10, floorNumber=10)", actualToStringResult);
//        assertEquals(1, actualSeatId);
//        assertEquals(10, actualFloorNumber);
//        assertEquals(10, actualTotalSeat.getSeatNumber());
//        assertEquals("Booked",actualTotalSeat.getReservationStatus());
//
//    }
}
