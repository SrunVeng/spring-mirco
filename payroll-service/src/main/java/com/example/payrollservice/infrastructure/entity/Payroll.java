package com.example.payrollservice.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="payroll")
@ToString
public class Payroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String baseSalary;
    private String pensionFundReduce;
    private String taxReduce;
    private String netSalary;
    private Long employeeId;
}
