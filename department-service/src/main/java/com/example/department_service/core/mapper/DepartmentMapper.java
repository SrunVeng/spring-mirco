package com.example.department_service.core.mapper;


import com.example.department_service.core.dto.request.DepartmentRequestDTO;
import com.example.department_service.core.dto.response.DepartmentDetailsResponseDTO;
import com.example.department_service.core.dto.response.DepartmentResponseDTO;
import com.example.department_service.infrastructure.entity.Department;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DepartmentMapper {

    // target nameMethod(source)

    List<DepartmentDetailsResponseDTO> toDepartmentDetailsResponseDTO(List<Department> department);

    DepartmentResponseDTO toDepartmentResponseDTO(Department department);
    Department fromDepartmentRequestDTO(DepartmentRequestDTO departmentRequestDTO);



}
