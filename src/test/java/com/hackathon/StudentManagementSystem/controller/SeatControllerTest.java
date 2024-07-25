//package com.hackathon.StudentManagementSystem.controller;
//
//import static org.mockito.Mockito.when;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.hackathon.StudentManagementSystem.model.ConfirmSeatRequest;
//import com.hackathon.StudentManagementSystem.model.SeatRequest;
//import com.hackathon.StudentManagementSystem.model.SeatResponse;
//import com.hackathon.StudentManagementSystem.service.SeatService;
//import com.hackathon.StudentManagementSystem.service.TotalSeatService;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.ResultActions;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//@ContextConfiguration(classes = {SeatController.class})
//@ExtendWith(SpringExtension.class)
//class SeatControllerTest {
//    @Autowired
//    private SeatController seatController;
//
//    @MockBean
//    private SeatService seatService;
//
//    @MockBean
//    private TotalSeatService totalSeatService;
//
//    /**
//     * Method under test: {@link SeatController#getTotalSeat()}
//     */
//    @Test
//    void testGetTotalSeat() throws Exception {
//        // Arrange
//        when(totalSeatService.getTotalSeat(any)).thenReturn(new ArrayList<>());
//        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/hackathon/total-seat");
//
//        // Act and Assert
//        MockMvcBuilders.standaloneSetup(seatController)
//                .build()
//                .perform(requestBuilder)
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
//                .andExpect(MockMvcResultMatchers.content().string("[]"));
//    }
//
//    /**
//     * Method under test: {@link SeatController#getTotalSeat()}
//     */
//    @Test
//    void testGetTotalSeat2() throws Exception {
//        // Arrange
//        when(totalSeatService.getTotalSeat()).thenReturn(new ArrayList<>());
//        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/hackathon/total-seat");
//        requestBuilder.characterEncoding("Encoding");
//
//        // Act and Assert
//        MockMvcBuilders.standaloneSetup(seatController)
//                .build()
//                .perform(requestBuilder)
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
//                .andExpect(MockMvcResultMatchers.content().string("[]"));
//    }
//
//    /**
//     * Method under test: {@link SeatController#bookedSeat(SeatRequest)}
//     */
//    @Test
//    void testBookedSeat() throws Exception {
//        // Arrange
//        SeatResponse buildResult = SeatResponse.builder().bookingId(1).status("Status").build();
//        when(seatService.bookedSeatWithSeatNumber(Mockito.<SeatRequest>any())).thenReturn(buildResult);
//
//        SeatRequest seatRequest = new SeatRequest();
//        seatRequest.setBookingId(1);
//        seatRequest.setDate(null);
//        seatRequest.setEmployId("42");
//        seatRequest.setFloorNumber(10);
//        seatRequest.setName("Name");
//        seatRequest.setReservationStatus("Reservation Status");
//        seatRequest.setSeatNumber(10);
//        String content = (new ObjectMapper()).writeValueAsString(seatRequest);
//        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/hackathon/seat-booking")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(content);
//
//        // Act and Assert
//        MockMvcBuilders.standaloneSetup(seatController)
//                .build()
//                .perform(requestBuilder)
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
//                .andExpect(MockMvcResultMatchers.content().string("{\"status\":\"Status\",\"bookingId\":1}"));
//    }
//
//    /**
//     * Method under test: {@link SeatController#confirmSeat(ConfirmSeatRequest)}
//     */
//    @Test
//    void testConfirmSeat() throws Exception {
//        // Arrange
//        SeatResponse buildResult = SeatResponse.builder().bookingId(1).status("Status").build();
//        when(seatService.confirmSeat(Mockito.<ConfirmSeatRequest>any())).thenReturn(buildResult);
//
//        ConfirmSeatRequest confirmSeatRequest = new ConfirmSeatRequest();
//        confirmSeatRequest.setBookingId(1);
//        confirmSeatRequest.setReservationStatus("Reservation Status");
//        String content = (new ObjectMapper()).writeValueAsString(confirmSeatRequest);
//        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/hackathon/confirm-seat")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(content);
//
//        // Act and Assert
//        MockMvcBuilders.standaloneSetup(seatController)
//                .build()
//                .perform(requestBuilder)
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
//                .andExpect(MockMvcResultMatchers.content().string("{\"status\":\"Status\",\"bookingId\":1}"));
//    }
//
//    /**
//     * Method under test: {@link SeatController#deleteUser(SeatRequest)}
//     */
//    @Test
//    void testDeleteUser() throws Exception {
//        // Arrange
//        when(seatService.deleteUser(Mockito.<SeatRequest>any())).thenReturn("Delete User");
//
//        SeatRequest seatRequest = new SeatRequest();
//        seatRequest.setBookingId(1);
//        seatRequest.setDate(null);
//        seatRequest.setEmployId("42");
//        seatRequest.setFloorNumber(10);
//        seatRequest.setName("Name");
//        seatRequest.setReservationStatus("Reservation Status");
//        seatRequest.setSeatNumber(10);
//        String content = (new ObjectMapper()).writeValueAsString(seatRequest);
//        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/hackathon/delete-user")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(content);
//
//        // Act and Assert
//        MockMvcBuilders.standaloneSetup(seatController)
//                .build()
//                .perform(requestBuilder)
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
//                .andExpect(MockMvcResultMatchers.content().string("Delete User"));
//    }
//
//    /**
//     * Method under test:
//     * {@link SeatController#getReservedSeat(String, String, String, LocalDate)}
//     */
//    @Test
//    void testGetReservedSeat() throws Exception {
//        // Arrange
//        when(seatService.getBookedSeat(Mockito.<String>any(), Mockito.<String>any(), Mockito.<String>any(),
//                Mockito.<LocalDate>any())).thenReturn(new ArrayList<>());
//        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/hackathon/user");
//
//        // Act
//        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(seatController).build().perform(requestBuilder);
//
//        // Assert
//        actualPerformResult.andExpect(MockMvcResultMatchers.status().isNotFound())
//                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
//                .andExpect(MockMvcResultMatchers.content().string("[]"));
//    }
//
//    /**
//     * Method under test:
//     * {@link SeatController#getReservedSeat(String, String, String, LocalDate)}
//     */
//    @Test
//    void testGetReservedSeat2() throws Exception {
//        // Arrange
//        SeatRequest seatRequest = new SeatRequest();
//        seatRequest.setBookingId(1);
//        seatRequest.setDate(LocalDate.of(1970, 1, 1));
//        seatRequest.setEmployId("42");
//        seatRequest.setFloorNumber(10);
//        seatRequest.setName("?");
//        seatRequest.setReservationStatus("?");
//        seatRequest.setSeatNumber(10);
//
//        ArrayList<SeatRequest> seatRequestList = new ArrayList<>();
//        seatRequestList.add(seatRequest);
//        when(seatService.getBookedSeat(Mockito.<String>any(), Mockito.<String>any(), Mockito.<String>any(),
//                Mockito.<LocalDate>any())).thenReturn(seatRequestList);
//        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/hackathon/user");
//
//        // Act and Assert
//        MockMvcBuilders.standaloneSetup(seatController)
//                .build()
//                .perform(requestBuilder)
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
//                .andExpect(MockMvcResultMatchers.content()
//                        .string(
//                                "[{\"bookingId\":1,\"employId\":\"42\",\"name\":\"?\",\"date\":\"1970-01-01\",\"seatNumber\":10,\"floorNumber\":10,"
//                                        + "\"reservationStatus\":\"?\"}]"));
//    }
//}
