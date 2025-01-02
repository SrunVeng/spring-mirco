package com.example.employee_service.core.mapper;



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



    EmployeeDetailsResponseDTO toEmployeeDetailsResponseDTO(Employee employee);





}
