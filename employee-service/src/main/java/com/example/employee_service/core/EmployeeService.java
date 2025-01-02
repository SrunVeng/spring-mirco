package com.example.employee_service.core;



import com.example.employee_service.core.dto.response.EmployeeDetailsResponseDTO;

public interface EmployeeService {


    EmployeeDetailsResponseDTO getEmployeeById(Long id);
}
