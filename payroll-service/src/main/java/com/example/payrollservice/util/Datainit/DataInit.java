package com.example.payrollservice.util.Datainit;

import com.example.payrollservice.infrastructure.entity.Employee;
import com.example.payrollservice.infrastructure.entity.Payroll;
import com.example.payrollservice.infrastructure.repository.EmployeeRepository;
import com.example.payrollservice.infrastructure.repository.PayrollRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class DataInit {

    private final PayrollRepository payrollRepository;
    private final EmployeeRepository employeeRepository;
    private final RestTemplate restTemplate;

    @PostConstruct
    public void Init() {
        DataFetching();
    }

    public void DataFetching() {
        // Fetch employees from an external service
        String employeeApiUrl = "http://localhost:8081/api/v1/employees/all"; // Example endpoint
        Employee[] employees = restTemplate.getForObject(employeeApiUrl, Employee[].class);

        if (employees != null) {
            for (Employee employee : employees) {
                // Save employees to local repository
                employeeRepository.save(employee);

                // Calculate payroll details
                Payroll payroll = Payroll.builder()
                        .employeeId(employee.getId())
                        .baseSalary(calculateBaseSalary(employee))
                        .pensionFundReduce("5%") // Example static value
                        .taxReduce("10%") // Example static value
                        .netSalary(calculateNetSalary(employee))
                        .build();

                // Save payroll to repository
                payrollRepository.save(payroll);
            }
        }
    }

    private String calculateBaseSalary(Employee employee) {
        // Example calculation logic based on jobGrade
        BigDecimal baseSalary;
        switch (employee.getJobGrade()) {
            case CHIEF:
                baseSalary = BigDecimal.valueOf(10000);
                break;
            case HEAD:
                baseSalary = BigDecimal.valueOf(8000);
                break;
            case SENIOR_MANAGER:
                baseSalary = BigDecimal.valueOf(7000);
                break;
            case MANAGER:
                baseSalary = BigDecimal.valueOf(6000);
                break;
            case SENIOR_ASSOCIATE:
                baseSalary = BigDecimal.valueOf(5000);
                break;
            case ASSOCIATE:
                baseSalary = BigDecimal.valueOf(4000);
                break;
            case JUNIOR_ASSOCIATE:
                baseSalary = BigDecimal.valueOf(3000);
                break;
            case APPRENTICE:
                baseSalary = BigDecimal.valueOf(2000);
                break;
            default:
                baseSalary = BigDecimal.valueOf(0); // Default for unknown grades
        }
        return baseSalary.toString();
    }

    private String calculateNetSalary(Employee employee) {
        // Example logic for net salary calculation
        BigDecimal baseSalary = new BigDecimal(calculateBaseSalary(employee));
        BigDecimal pensionReduction = baseSalary.multiply(BigDecimal.valueOf(0.05)); // 5%
        BigDecimal taxReduction = baseSalary.multiply(BigDecimal.valueOf(0.10)); // 10%
        BigDecimal netSalary = baseSalary.subtract(pensionReduction).subtract(taxReduction);
        return netSalary.toString();
    }
}
