package com.example.employee_service.application;





import com.example.employee_service.application.dto.response.EmployeeDeatilsResponseVO;
import com.example.employee_service.application.mapper.EmployeeVOMapper;
import com.example.employee_service.core.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class Controller {

    private final EmployeeService employeeService;
    private final EmployeeVOMapper employeeVOMapper;

    @GetMapping("/all")
    public List<EmployeeDeatilsResponseVO> getAllEmployees() {
        return employeeVOMapper.toListEmployeeDetailsResponseVO(employeeService.getAllEmployees());
    }
}
