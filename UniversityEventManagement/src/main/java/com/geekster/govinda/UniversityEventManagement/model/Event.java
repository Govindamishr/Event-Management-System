package com.geekster.govinda.UniversityEventManagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table


public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer eventId;

    private String eventName;

    private String locationOfEvent;
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private LocalDate date;


    @DateTimeFormat(pattern = "HH:mm:ss")
    private LocalTime startTime;

    @DateTimeFormat(pattern = "HH:mm:ss")

    private LocalTime endTime;
}
