package com.hackathon.StudentManagementSystem.utill;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.hackathon.StudentManagementSystem.model.SeatRequest;
import com.hackathon.StudentManagementSystem.repository.SeatRepo;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ScheduledTasks.class})
@ExtendWith(SpringExtension.class)
class ScheduledTasksTest {
    @Autowired
    private ScheduledTasks scheduledTasks;

    @MockBean
    private SeatRepo seatRepo;

    /**
     * Method under test: {@link ScheduledTasks#runAt11AmDaily()}
     */
    @Test
    void testRunAt11AmDaily() {
        // Arrange
        when(seatRepo.getAllUserByStatus(Mockito.<String>any(), Mockito.<LocalDate>any())).thenReturn(new ArrayList<>());
        doNothing().when(seatRepo).deleteAll(Mockito.<Iterable<SeatRequest>>any());

        // Act
        scheduledTasks.runAt11AmDaily();

        // Assert that nothing has changed
        verify(seatRepo).getAllUserByStatus(eq("Booked"), isA(LocalDate.class));
        verify(seatRepo).deleteAll(isA(Iterable.class));
    }
}
