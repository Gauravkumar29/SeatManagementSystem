package com.hackathon.StudentManagementSystem.utill;

import com.hackathon.StudentManagementSystem.model.SeatRequest;
import com.hackathon.StudentManagementSystem.repository.SeatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Component
public class ScheduledTasks {

    @Autowired
    SeatRepo seatRepo;
   @Scheduled(cron = "0 15 11 * * ?")
   // @Scheduled(cron = "0/10 * * ? * *")
    public void runAt11AmDaily() {

        System.out.println("Scheduler run at , "+ LocalDateTime.now());
        LocalDate date = LocalDate.now();
        List<SeatRequest> list = seatRepo.getAllUserByStatus("Booked",date);

        seatRepo.deleteAll(list);
    }
}
