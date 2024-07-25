//package com.hackathon.StudentManagementSystem.service.impl;
//
//import static org.junit.jupiter.api.Assertions.assertSame;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.mockito.Mockito.atLeast;
//import static org.mockito.Mockito.doNothing;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import com.hackathon.StudentManagementSystem.model.TotalSeat;
//import com.hackathon.StudentManagementSystem.repository.TotalSeatRepo;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//@ContextConfiguration(classes = {TotalSeatImpl.class})
//@ExtendWith(SpringExtension.class)
//class TotalSeatImplTest {
//    @Autowired
//    private TotalSeatImpl totalSeatImpl;
//
//    @MockBean
//    private TotalSeatRepo totalSeatRepo;
//
//    /**
//     * Method under test: {@link TotalSeatImpl#addTotalSeat()}
//     */
//    @Test
//    void testAddTotalSeat() {
//        // Arrange
//        TotalSeat totalSeat = new TotalSeat();
//        totalSeat.setFloorNumber(10);
//        totalSeat.setSeatId(1);
//        totalSeat.setSeatNumber(10);
//        when(totalSeatRepo.save(Mockito.<TotalSeat>any())).thenReturn(totalSeat);
//
//        // Act
//        totalSeatImpl.addTotalSeat();
//
//        // Assert
//        verify(totalSeatRepo, atLeast(1)).save(Mockito.<TotalSeat>any());
//    }
//
//    /**
//     * Method under test: {@link TotalSeatImpl#getTotalSeat()}
//     */
//    @Test
//    void testGetTotalSeat() {
//        // Arrange
//        TotalSeat totalSeat = new TotalSeat();
//        totalSeat.setFloorNumber(10);
//        totalSeat.setSeatId(1);
//        totalSeat.setSeatNumber(10);
//        when(totalSeatRepo.save(Mockito.<TotalSeat>any())).thenReturn(totalSeat);
//        ArrayList<TotalSeat> totalSeatList = new ArrayList<>();
//        when(totalSeatRepo.findAll()).thenReturn(totalSeatList);
//        doNothing().when(totalSeatRepo).deleteAll();
//
//        // Act
//        List<TotalSeat> actualTotalSeat = totalSeatImpl.getTotalSeat();
//
//        // Assert
//        verify(totalSeatRepo).findAll();
//        verify(totalSeatRepo).deleteAll();
//        verify(totalSeatRepo, atLeast(1)).save(Mockito.<TotalSeat>any());
//        assertTrue(actualTotalSeat.isEmpty());
//        assertSame(totalSeatList, actualTotalSeat);
//    }
//}
