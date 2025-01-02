package com.example.employee_service.util.Datainit;

import com.example.employee_service.infrastructure.entity.Department;
import com.example.employee_service.infrastructure.entity.Employee;
import com.example.employee_service.infrastructure.repository.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInit {

    private final EmployeeRepository employeeRepository;
    private final RestTemplate restTemplate;

    @PostConstruct
    public void init() {
        // Fetch departments from department_service
        List<Department> departments = fetchDepartments();

        // Create employees and associate them with departments
        Employee employee1 = createEmployee("John", "Doe", "john.doe@example.com", departments.get(0));
        Employee employee2 = createEmployee("Jane", "Smith", "jane.smith@example.com", departments.get(1));
        Employee employee3 = createEmployee("Mike", "Brown", "mike.brown@example.com", departments.get(0));
        Employee employee4 = createEmployee("Anna", "Taylor", "anna.taylor@example.com", departments.get(1));

        employeeRepository.saveAll(List.of(employee1, employee2, employee3, employee4));
    }

    private List<Department> fetchDepartments() {
        ResponseEntity<List<Department>> response = restTemplate.exchange(
                "http://localhost:8080/api/departments",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {}
        );
        return response.getBody();
    }

    private static Employee createEmployee(String firstName, String lastName, String email, Department department) {
        return Employee.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .department(department)
                .build();
    }
}
