package com.example.payrollservice.util.Datainit;

import com.example.payrollservice.application.dto.response.EmployeeResponseVO;
import com.example.payrollservice.application.mapper.EmployeeVOMapper;
import com.example.payrollservice.core.dto.response.EmployeeResponseDTO;
import com.example.payrollservice.core.mapper.EmployeeMapper;
import com.example.payrollservice.infrastructure.entity.Employee;
import com.example.payrollservice.infrastructure.repository.EmployeeRepository;
import com.example.payrollservice.infrastructure.repository.PayrollRepository;
import com.example.payrollservice.util.Calculator.Calculator;
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

    private final PayrollRepository payrollRepository;
    private final EmployeeRepository employeeRepository;
    private final RestTemplate restTemplate;
    private final EmployeeMapper employeeMapper;
    private final EmployeeVOMapper employeeVOMapper;
    private final Calculator calculator;

    @PostConstruct
    public void Init() {
        DataFetching();
    }

    public void DataFetching() {
        // Fetch employees from an external service
        String employeeApiUrl = "http://localhost:8081/api/v1/employees/all";
        // Use ParameterizedTypeReference to deserialize the list of Employee objects
        ResponseEntity<List<EmployeeResponseVO>> response = restTemplate.exchange(
                employeeApiUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<EmployeeResponseVO>>() {
                }
        );
        List<EmployeeResponseDTO> employeeResponseDTOS = employeeVOMapper.fromListEmployeeDetailsResponseVO(response.getBody());
        List<Employee> employees = employeeMapper.fromListEmployeeDetailsResponseDTO(employeeResponseDTOS);



        // Save each employee in the repository
        employeeRepository.saveAll(employees);


    }
}
