package com.example.payrollservice.util.Calculator;

import com.example.payrollservice.common.constants.SalaryConfig;
import com.example.payrollservice.infrastructure.entity.Employee;

import java.math.BigDecimal;

public class Calculator {


    private static String calculateBaseSalary(Employee employee) {
        // Example calculation logic based on jobGrade
        BigDecimal baseSalary = switch (employee.getJobGrade()) {
            case CHIEF -> SalaryConfig.CHIEF_SALARY;
            case HEAD -> SalaryConfig.HEAD_SALARY;
            case SENIOR_MANAGER -> SalaryConfig.SENIOR_MANAGER_SALARY;
            case MANAGER -> SalaryConfig.MANAGER_SALARY;
            case SENIOR_ASSOCIATE -> SalaryConfig.SENIOR_ASSOCIATE_SALARY;
            case ASSOCIATE -> SalaryConfig.ASSOCIATE_SALARY;
            case JUNIOR_ASSOCIATE -> SalaryConfig.JUNIOR_ASSOCIATE_SALARY;
            case APPRENTICE -> SalaryConfig.APPRENTICE_SALARY;
            default -> BigDecimal.valueOf(0); // Default for unknown grades
        };
        return baseSalary.toString();
    }

    private static String calculateNetSalary(Employee employee) {
        // Example logic for net salary calculation
        BigDecimal baseSalary = new BigDecimal(calculateBaseSalary(employee));
        BigDecimal pensionReduction = baseSalary.multiply(SalaryConfig.PENSION_RATE);
        BigDecimal taxReduction = baseSalary.multiply(SalaryConfig.TAX_RATE);
        BigDecimal netSalary = baseSalary.subtract(pensionReduction).subtract(taxReduction);
        return netSalary.toString();
    }
}
