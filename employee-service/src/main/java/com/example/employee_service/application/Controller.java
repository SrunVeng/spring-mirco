package com.example.employee_service.application;


import com.example.employee_service.application.dto.response.EmployeeDetailsResponseVO;
import com.example.employee_service.application.mapper.EmployeeVOMapper;
import com.example.employee_service.core.EmployeeService;
import com.example.employee_service.core.dto.response.EmployeeDetailsResponseDTO;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class Controller {

    private final EmployeeService employeeService;
    private final EmployeeVOMapper employeeVOMapper;

    @GetMapping("/{id}")
    EmployeeDetailsResponseVO getEmployeeById(@PathVariable Long id) {
        return employeeVOMapper.toEmployeeDetailsResponseVO(employeeService.getEmployeeById(id));

    }


}
