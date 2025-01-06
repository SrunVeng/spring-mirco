package com.example.payrollservice.core.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class PayrollDetailsResponseDTO {

    private Long Id;
    private String baseSalary;
    private String pensionFundReduce;
    private String taxReduce;
    private String netSalary;
    private Long employeeId;
}
