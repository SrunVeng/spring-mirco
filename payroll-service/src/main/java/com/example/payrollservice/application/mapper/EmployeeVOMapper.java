package com.example.payrollservice.application.mapper;


import com.example.payrollservice.application.dto.response.EmployeeResponseVO;
import com.example.payrollservice.core.dto.response.EmployeeResponseDTO;
import com.example.payrollservice.infrastructure.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployeeVOMapper {

        List<EmployeeResponseDTO> fromListEmployeeDetailsResponseVO(List<EmployeeResponseVO> employeeResponseVO);

}
