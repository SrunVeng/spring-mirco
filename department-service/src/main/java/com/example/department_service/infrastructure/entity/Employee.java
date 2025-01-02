package com.example.department_service.infrastructure.entity;


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

    @Column(unique = true, nullable = false)
    private String email;

    @ManyToOne
    private Department department;




}
