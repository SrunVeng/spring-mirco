package com.example.department_service.core.mapper;


import com.example.department_service.core.dto.response.DepartmentDetailsResponseDTO;
import com.example.department_service.infrastructure.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DepartmentMapper {

    List<DepartmentDetailsResponseDTO> toDepartmentDetailsResponseDTO(List<Department> department);





}
