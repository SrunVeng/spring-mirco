package com.example.payrollservice.util.Calculator;

import com.example.payrollservice.infrastructure.entity.Employee;

import java.math.BigDecimal;

public class Calculator {


    private static String calculateBaseSalary(Employee employee) {
        // Example calculation logic based on jobGrade
        BigDecimal baseSalary = switch (employee.getJobGrade()) {
            case CHIEF -> BigDecimal.valueOf(10000);
            case HEAD -> BigDecimal.valueOf(8000);
            case SENIOR_MANAGER -> BigDecimal.valueOf(7000);
            case MANAGER -> BigDecimal.valueOf(6000);
            case SENIOR_ASSOCIATE -> BigDecimal.valueOf(5000);
            case ASSOCIATE -> BigDecimal.valueOf(4000);
            case JUNIOR_ASSOCIATE -> BigDecimal.valueOf(3000);
            case APPRENTICE -> BigDecimal.valueOf(2000);
            default -> BigDecimal.valueOf(0); // Default for unknown grades
        };
        return baseSalary.toString();
    }

    private static String calculateNetSalary(Employee employee) {
        // Example logic for net salary calculation
        BigDecimal baseSalary = new BigDecimal(calculateBaseSalary(employee));
        BigDecimal pensionReduction = baseSalary.multiply(BigDecimal.valueOf(0.05)); // 5%
        BigDecimal taxReduction = baseSalary.multiply(BigDecimal.valueOf(0.10)); // 10%
        BigDecimal netSalary = baseSalary.subtract(pensionReduction).subtract(taxReduction);
        return netSalary.toString();
    }
}
