package com.hackathon.StudentManagementSystem.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "total_seat")

public class TotalSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seatId;
    private int seatNumber;
    private int floorNumber;
}
