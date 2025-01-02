package com.example.department_service.infrastructure.entity;


import jakarta.persistence.*;
import lombok.*;

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
    private String departmentCode;


    //Employee Entity
    // id
    // first name
    // last name
    // email (Unique , not null)


}
