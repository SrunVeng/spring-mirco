package com.example.employee_service.core;


import com.example.employee_service.core.dto.response.EmployeeDetailsResponseDTO;
import com.example.employee_service.core.mapper.EmployeeMapper;
import com.example.employee_service.infrastructure.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeDetailsResponseDTO getEmployeeById(Long id) {
        return employeeMapper.toEmployeeDetailsResponseDTO(employeeRepository.findById(id).orElseThrow());
    }
}
