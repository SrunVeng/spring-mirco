package com.example.payrollservice.core;


import com.example.employee_service.core.dto.response.EmployeeDetailsResponseDTO;

import java.util.List;

public interface EmployeeService {


    List<EmployeeDetailsResponseDTO> getAllEmployees();
}
