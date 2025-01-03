package com.example.payrollservice.core.mapper;


import com.example.employee_service.core.dto.response.EmployeeDetailsResponseDTO;
import com.example.employee_service.infrastructure.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployeeMapper {


        List<EmployeeDetailsResponseDTO> toListEmployeeDetailsResponseDTO(List<Employee> employees);


}
