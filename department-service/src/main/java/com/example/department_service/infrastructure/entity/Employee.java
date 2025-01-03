package com.example.department_service.infrastructure.entity;


import com.example.department_service.common.enumeration.JobGrade;
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
    @Column( unique = true)
    private String email;


    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;


    private String jobTitle;
    private JobGrade jobGrade;




}
