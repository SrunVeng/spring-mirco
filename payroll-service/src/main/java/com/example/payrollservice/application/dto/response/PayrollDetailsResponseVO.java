package com.example.payrollservice.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class PayrollDetailsResponseVO {

    private Long Id;
    private String baseSalary;
    private String pensionFundReduce;
    private String taxReduce;
    private String netSalary;
    private Long employeeId;

}
