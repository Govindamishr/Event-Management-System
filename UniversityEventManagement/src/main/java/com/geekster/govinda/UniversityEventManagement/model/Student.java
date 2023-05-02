package com.geekster.govinda.UniversityEventManagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;


    @Pattern(regexp = "^[A-Z][a-z]*$", message = "First name should start with a capital letter")
    private String firstName;

    @Pattern(regexp = "^[A-Z][a-z]*$", message = "First name should start with a capital letter")
    private String lastName;
    @NotNull

    @Min(18)
    @Max(25)

    private int age;

    @Enumerated(EnumType.STRING)
    private Department department;
}
