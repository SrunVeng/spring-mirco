package com.example.payrollservice.infrastructure.entity;

import com.example.payrollservice.common.enumeration.JobGrade;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="employees")
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;
    @Column(nullable = true, unique = true)
    private String email;

    // free writing when set
    @Column(nullable = true)
    private String jobTitle;

    // make enum ( Chief, Head, Senior Manager, Manager, Senior Associate, Associate, Junior Associate,Apprentice)
    @Column(nullable = true)
    private JobGrade jobGrade;
}