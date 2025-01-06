package com.example.payrollservice.core.mapper;


import com.example.payrollservice.core.dto.response.EmployeeResponseDTO;
import com.example.payrollservice.core.dto.response.PayrollDetailsResponseDTO;
import com.example.payrollservice.infrastructure.entity.Employee;
import com.example.payrollservice.infrastructure.entity.Payroll;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployeeMapper {

        List<Employee> fromListEmployeeDetailsResponseDTO(List<EmployeeResponseDTO> employeeResponseDTO);

}
