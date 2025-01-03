package com.example.department_service.infrastructure.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="departments")
@ToString
public class Department {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String departmentName;
    private String departmentDescription;
    @Column(nullable = false, unique = true)
    private String departmentCode;



}
