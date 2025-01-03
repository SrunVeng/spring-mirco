package com.example.employee_service.application.mapper;


import com.example.employee_service.application.dto.response.EmployeeDeatilsResponseVO;
import com.example.employee_service.core.dto.response.EmployeeDetailsResponseDTO;
import org.mapstruct.Mapper;

import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;


@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployeeVOMapper {


    List<EmployeeDeatilsResponseVO> toListEmployeeDetailsResponseVO(List<EmployeeDetailsResponseDTO> employeeDetailsResponseDTO);



}
