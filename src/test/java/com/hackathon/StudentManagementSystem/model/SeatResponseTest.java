package com.hackathon.StudentManagementSystem.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SeatResponseTest {

    @Test
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
        // Arrange
        SeatResponse buildResult = SeatResponse.builder().bookingId(1).status("Status").build();
        SeatResponse buildResult2 = SeatResponse.builder().bookingId(1).status("Status").build();

        // Act and Assert
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link SeatResponse#equals(Object)}
     *   <li>{@link SeatResponse#hashCode()}
     * </ul>
     */
    @Test
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
        // Arrange
        SeatResponse.SeatResponseBuilder seatResponseBuilder = mock(SeatResponse.SeatResponseBuilder.class);
        when(seatResponseBuilder.bookingId(Mockito.<Integer>any())).thenReturn(SeatResponse.builder());
        SeatResponse buildResult = seatResponseBuilder.bookingId(1).status("Status").build();
        SeatResponse.SeatResponseBuilder seatResponseBuilder2 = mock(SeatResponse.SeatResponseBuilder.class);
        when(seatResponseBuilder2.bookingId(Mockito.<Integer>any())).thenReturn(SeatResponse.builder());
        SeatResponse buildResult2 = seatResponseBuilder2.bookingId(1).status("Status").build();

        // Act and Assert
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link SeatResponse#equals(Object)}
     *   <li>{@link SeatResponse#hashCode()}
     * </ul>
     */
    @Test
    void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
        // Arrange
        SeatResponse buildResult = SeatResponse.builder().bookingId(1).status("Status").build();

        // Act and Assert
        assertEquals(buildResult, buildResult);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult.hashCode());
    }

    /**
     * Method under test: {@link SeatResponse#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
        // Arrange
        SeatResponse.SeatResponseBuilder seatResponseBuilder = mock(SeatResponse.SeatResponseBuilder.class);
        when(seatResponseBuilder.bookingId(Mockito.<Integer>any())).thenReturn(SeatResponse.builder());
        SeatResponse buildResult = seatResponseBuilder.bookingId(1).status("Status").build();
        SeatResponse buildResult2 = SeatResponse.builder().bookingId(1).status("Status").build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link SeatResponse#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
        // Arrange
        SeatResponse.SeatResponseBuilder seatResponseBuilder = mock(SeatResponse.SeatResponseBuilder.class);
        when(seatResponseBuilder.status(Mockito.<String>any())).thenReturn(SeatResponse.builder());
        SeatResponse.SeatResponseBuilder seatResponseBuilder2 = mock(SeatResponse.SeatResponseBuilder.class);
        when(seatResponseBuilder2.bookingId(Mockito.<Integer>any())).thenReturn(seatResponseBuilder);
        SeatResponse buildResult = seatResponseBuilder2.bookingId(1).status("Status").build();
        SeatResponse.SeatResponseBuilder seatResponseBuilder3 = mock(SeatResponse.SeatResponseBuilder.class);
        when(seatResponseBuilder3.bookingId(Mockito.<Integer>any())).thenReturn(SeatResponse.builder());
        SeatResponse buildResult2 = seatResponseBuilder3.bookingId(1).status("Status").build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link SeatResponse#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
        // Arrange
        SeatResponse.SeatResponseBuilder seatResponseBuilder = mock(SeatResponse.SeatResponseBuilder.class);
        SeatResponse buildResult = SeatResponse.builder().bookingId(1).status("Status").build();
        when(seatResponseBuilder.build()).thenReturn(buildResult);
        SeatResponse.SeatResponseBuilder seatResponseBuilder2 = mock(SeatResponse.SeatResponseBuilder.class);
        when(seatResponseBuilder2.status(Mockito.<String>any())).thenReturn(seatResponseBuilder);
        SeatResponse.SeatResponseBuilder seatResponseBuilder3 = mock(SeatResponse.SeatResponseBuilder.class);
        when(seatResponseBuilder3.bookingId(Mockito.<Integer>any())).thenReturn(seatResponseBuilder2);
        SeatResponse buildResult2 = seatResponseBuilder3.bookingId(1).status("Status").build();
        SeatResponse.SeatResponseBuilder seatResponseBuilder4 = mock(SeatResponse.SeatResponseBuilder.class);
        when(seatResponseBuilder4.bookingId(Mockito.<Integer>any())).thenReturn(SeatResponse.builder());
        SeatResponse buildResult3 = seatResponseBuilder4.bookingId(1).status("Status").build();

        // Act and Assert
        assertNotEquals(buildResult2, buildResult3);
    }

    /**
     * Method under test: {@link SeatResponse#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsNull_thenReturnNotEqual() {
        // Arrange
        SeatResponse buildResult = SeatResponse.builder().bookingId(1).status("Status").build();

        // Act and Assert
        assertNotEquals(buildResult, null);
    }

    /**
     * Method under test: {@link SeatResponse#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
        // Arrange
        SeatResponse buildResult = SeatResponse.builder().bookingId(1).status("Status").build();

        // Act and Assert
        assertNotEquals(buildResult, "Different type to SeatResponse");
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link SeatResponse#SeatResponse()}
     *   <li>{@link SeatResponse#setBookingId(Integer)}
     *   <li>{@link SeatResponse#setStatus(String)}
     *   <li>{@link SeatResponse#toString()}
     *   <li>{@link SeatResponse#getBookingId()}
     *   <li>{@link SeatResponse#getStatus()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        SeatResponse actualSeatResponse = new SeatResponse();
        actualSeatResponse.setBookingId(1);
        actualSeatResponse.setStatus("Status");
        String actualToStringResult = actualSeatResponse.toString();
        Integer actualBookingId = actualSeatResponse.getBookingId();

        // Assert that nothing has changed
        assertEquals("SeatResponse(status=Status, bookingId=1)", actualToStringResult);
        assertEquals("Status", actualSeatResponse.getStatus());
        assertEquals(1, actualBookingId.intValue());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link SeatResponse#SeatResponse(String, Integer)}
     *   <li>{@link SeatResponse#setBookingId(Integer)}
     *   <li>{@link SeatResponse#setStatus(String)}
     *   <li>{@link SeatResponse#toString()}
     *   <li>{@link SeatResponse#getBookingId()}
     *   <li>{@link SeatResponse#getStatus()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        SeatResponse actualSeatResponse = new SeatResponse("Status", 1);
        actualSeatResponse.setBookingId(1);
        actualSeatResponse.setStatus("Status");
        String actualToStringResult = actualSeatResponse.toString();
        Integer actualBookingId = actualSeatResponse.getBookingId();

        // Assert that nothing has changed
        assertEquals("SeatResponse(status=Status, bookingId=1)", actualToStringResult);
        assertEquals("Status", actualSeatResponse.getStatus());
        assertEquals(1, actualBookingId.intValue());
    }
}
