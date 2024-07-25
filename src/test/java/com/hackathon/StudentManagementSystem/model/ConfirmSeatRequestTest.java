//package com.hackathon.StudentManagementSystem.model;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//class ConfirmSeatRequestTest {
//    /**
//     * Methods under test:
//     * <ul>
//     *   <li>{@link ConfirmSeatRequest#equals(Object)}
//     *   <li>{@link ConfirmSeatRequest#hashCode()}
//     * </ul>
//     */
//    @Test
//    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
//        // Arrange
//        ConfirmSeatRequest buildResult = ConfirmSeatRequest.builder()
//                .bookingId(1)
//                .reservationStatus("Reservation Status")
//                .build();
//        ConfirmSeatRequest buildResult2 = ConfirmSeatRequest.builder()
//                .bookingId(1)
//                .reservationStatus("Reservation Status")
//                .build();
//
//        // Act and Assert
//        assertEquals(buildResult, buildResult2);
//        int expectedHashCodeResult = buildResult.hashCode();
//        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
//    }
//
//    /**
//     * Methods under test:
//     * <ul>
//     *   <li>{@link ConfirmSeatRequest#equals(Object)}
//     *   <li>{@link ConfirmSeatRequest#hashCode()}
//     * </ul>
//     */
//    @Test
//    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
//        // Arrange
//        ConfirmSeatRequest.ConfirmSeatRequestBuilder confirmSeatRequestBuilder = mock(
//                ConfirmSeatRequest.ConfirmSeatRequestBuilder.class);
//        when(confirmSeatRequestBuilder.bookingId(Mockito.<Integer>any())).thenReturn(ConfirmSeatRequest.builder());
//        ConfirmSeatRequest buildResult = confirmSeatRequestBuilder.bookingId(1)
//                .reservationStatus("Reservation Status")
//                .build();
//        ConfirmSeatRequest.ConfirmSeatRequestBuilder confirmSeatRequestBuilder2 = mock(
//                ConfirmSeatRequest.ConfirmSeatRequestBuilder.class);
//        when(confirmSeatRequestBuilder2.bookingId(Mockito.<Integer>any())).thenReturn(ConfirmSeatRequest.builder());
//        ConfirmSeatRequest buildResult2 = confirmSeatRequestBuilder2.bookingId(1)
//                .reservationStatus("Reservation Status")
//                .build();
//
//        // Act and Assert
//        assertEquals(buildResult, buildResult2);
//        int expectedHashCodeResult = buildResult.hashCode();
//        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
//    }
//
//    /**
//     * Methods under test:
//     * <ul>
//     *   <li>{@link ConfirmSeatRequest#equals(Object)}
//     *   <li>{@link ConfirmSeatRequest#hashCode()}
//     * </ul>
//     */
//    @Test
//    void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
//        // Arrange
//        ConfirmSeatRequest buildResult = ConfirmSeatRequest.builder()
//                .bookingId(1)
//                .reservationStatus("Reservation Status")
//                .build();
//
//        // Act and Assert
//        assertEquals(buildResult, buildResult);
//        int expectedHashCodeResult = buildResult.hashCode();
//        assertEquals(expectedHashCodeResult, buildResult.hashCode());
//    }
//
//    /**
//     * Method under test: {@link ConfirmSeatRequest#equals(Object)}
//     */
//    @Test
//    void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
//        // Arrange
//        ConfirmSeatRequest.ConfirmSeatRequestBuilder confirmSeatRequestBuilder = mock(
//                ConfirmSeatRequest.ConfirmSeatRequestBuilder.class);
//        when(confirmSeatRequestBuilder.bookingId(Mockito.<Integer>any())).thenReturn(ConfirmSeatRequest.builder());
//        ConfirmSeatRequest buildResult = confirmSeatRequestBuilder.bookingId(1)
//                .reservationStatus("Reservation Status")
//                .build();
//        ConfirmSeatRequest buildResult2 = ConfirmSeatRequest.builder()
//                .bookingId(1)
//                .reservationStatus("Reservation Status")
//                .build();
//
//        // Act and Assert
//        assertNotEquals(buildResult, buildResult2);
//    }
//
//    /**
//     * Method under test: {@link ConfirmSeatRequest#equals(Object)}
//     */
//    @Test
//    void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
//        // Arrange
//        ConfirmSeatRequest.ConfirmSeatRequestBuilder confirmSeatRequestBuilder = mock(
//                ConfirmSeatRequest.ConfirmSeatRequestBuilder.class);
//        when(confirmSeatRequestBuilder.reservationStatus(Mockito.<String>any())).thenReturn(ConfirmSeatRequest.builder());
//        ConfirmSeatRequest.ConfirmSeatRequestBuilder confirmSeatRequestBuilder2 = mock(
//                ConfirmSeatRequest.ConfirmSeatRequestBuilder.class);
//        when(confirmSeatRequestBuilder2.bookingId(Mockito.<Integer>any())).thenReturn(confirmSeatRequestBuilder);
//        ConfirmSeatRequest buildResult = confirmSeatRequestBuilder2.bookingId(1)
//                .reservationStatus("Reservation Status")
//                .build();
//        ConfirmSeatRequest.ConfirmSeatRequestBuilder confirmSeatRequestBuilder3 = mock(
//                ConfirmSeatRequest.ConfirmSeatRequestBuilder.class);
//        when(confirmSeatRequestBuilder3.bookingId(Mockito.<Integer>any())).thenReturn(ConfirmSeatRequest.builder());
//        ConfirmSeatRequest buildResult2 = confirmSeatRequestBuilder3.bookingId(1)
//                .reservationStatus("Reservation Status")
//                .build();
//
//        // Act and Assert
//        assertNotEquals(buildResult, buildResult2);
//    }
//
//    /**
//     * Method under test: {@link ConfirmSeatRequest#equals(Object)}
//     */
//    @Test
//    void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
//        // Arrange
//        ConfirmSeatRequest.ConfirmSeatRequestBuilder confirmSeatRequestBuilder = mock(
//                ConfirmSeatRequest.ConfirmSeatRequestBuilder.class);
//        ConfirmSeatRequest buildResult = ConfirmSeatRequest.builder()
//                .bookingId(1)
//                .reservationStatus("Reservation Status")
//                .build();
//        when(confirmSeatRequestBuilder.build()).thenReturn(buildResult);
//        ConfirmSeatRequest.ConfirmSeatRequestBuilder confirmSeatRequestBuilder2 = mock(
//                ConfirmSeatRequest.ConfirmSeatRequestBuilder.class);
//        when(confirmSeatRequestBuilder2.reservationStatus(Mockito.<String>any())).thenReturn(confirmSeatRequestBuilder);
//        ConfirmSeatRequest.ConfirmSeatRequestBuilder confirmSeatRequestBuilder3 = mock(
//                ConfirmSeatRequest.ConfirmSeatRequestBuilder.class);
//        when(confirmSeatRequestBuilder3.bookingId(Mockito.<Integer>any())).thenReturn(confirmSeatRequestBuilder2);
//        ConfirmSeatRequest buildResult2 = confirmSeatRequestBuilder3.bookingId(1)
//                .reservationStatus("Reservation Status")
//                .build();
//        ConfirmSeatRequest.ConfirmSeatRequestBuilder confirmSeatRequestBuilder4 = mock(
//                ConfirmSeatRequest.ConfirmSeatRequestBuilder.class);
//        when(confirmSeatRequestBuilder4.bookingId(Mockito.<Integer>any())).thenReturn(ConfirmSeatRequest.builder());
//        ConfirmSeatRequest buildResult3 = confirmSeatRequestBuilder4.bookingId(1)
//                .reservationStatus("Reservation Status")
//                .build();
//
//        // Act and Assert
//        assertNotEquals(buildResult2, buildResult3);
//    }
//
//    /**
//     * Method under test: {@link ConfirmSeatRequest#equals(Object)}
//     */
//    @Test
//    void testEquals_whenOtherIsNull_thenReturnNotEqual() {
//        // Arrange
//        ConfirmSeatRequest buildResult = ConfirmSeatRequest.builder()
//                .bookingId(1)
//                .reservationStatus("Reservation Status")
//                .build();
//
//        // Act and Assert
//        assertNotEquals(buildResult, null);
//    }
//
//    /**
//     * Method under test: {@link ConfirmSeatRequest#equals(Object)}
//     */
//    @Test
//    void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
//        // Arrange
//        ConfirmSeatRequest buildResult = ConfirmSeatRequest.builder()
//                .bookingId(1)
//                .reservationStatus("Reservation Status")
//                .build();
//
//        // Act and Assert
//        assertNotEquals(buildResult, "Different type to ConfirmSeatRequest");
//    }
//
//    /**
//     * Methods under test:
//     * <ul>
//     *   <li>{@link ConfirmSeatRequest#ConfirmSeatRequest()}
//     *   <li>{@link ConfirmSeatRequest#setBookingId(Integer)}
//     *   <li>{@link ConfirmSeatRequest#setReservationStatus(String)}
//     *   <li>{@link ConfirmSeatRequest#toString()}
//     *   <li>{@link ConfirmSeatRequest#getBookingId()}
//     *   <li>{@link ConfirmSeatRequest#getReservationStatus()}
//     * </ul>
//     */
//    @Test
//    void testGettersAndSetters() {
//        // Arrange and Act
//        ConfirmSeatRequest actualConfirmSeatRequest = new ConfirmSeatRequest();
//        actualConfirmSeatRequest.setBookingId(1);
//        actualConfirmSeatRequest.setReservationStatus("Reservation Status");
//        String actualToStringResult = actualConfirmSeatRequest.toString();
//        Integer actualBookingId = actualConfirmSeatRequest.getBookingId();
//
//        // Assert that nothing has changed
//        assertEquals("ConfirmSeatRequest(bookingId=1, reservationStatus=Reservation Status)", actualToStringResult);
//        assertEquals("Reservation Status", actualConfirmSeatRequest.getReservationStatus());
//        assertEquals(1, actualBookingId.intValue());
//    }
//
//    /**
//     * Methods under test:
//     * <ul>
//     *   <li>{@link ConfirmSeatRequest#ConfirmSeatRequest(Integer, String)}
//     *   <li>{@link ConfirmSeatRequest#setBookingId(Integer)}
//     *   <li>{@link ConfirmSeatRequest#setReservationStatus(String)}
//     *   <li>{@link ConfirmSeatRequest#toString()}
//     *   <li>{@link ConfirmSeatRequest#getBookingId()}
//     *   <li>{@link ConfirmSeatRequest#getReservationStatus()}
//     * </ul>
//     */
//    @Test
//    void testGettersAndSetters2() {
//        // Arrange and Act
//        ConfirmSeatRequest actualConfirmSeatRequest = new ConfirmSeatRequest(1, "Reservation Status");
//        actualConfirmSeatRequest.setBookingId(1);
//        actualConfirmSeatRequest.setReservationStatus("Reservation Status");
//        String actualToStringResult = actualConfirmSeatRequest.toString();
//        Integer actualBookingId = actualConfirmSeatRequest.getBookingId();
//
//        // Assert that nothing has changed
//        assertEquals("ConfirmSeatRequest(bookingId=1, reservationStatus=Reservation Status)", actualToStringResult);
//        assertEquals("Reservation Status", actualConfirmSeatRequest.getReservationStatus());
//        assertEquals(1, actualBookingId.intValue());
//    }
//}
