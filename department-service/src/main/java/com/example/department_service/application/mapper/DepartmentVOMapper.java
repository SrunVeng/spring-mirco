package com.example.department_service.application.mapper;


import com.example.department_service.application.dto.response.DepartmentDetailsResponseVO;
import com.example.department_service.core.dto.response.DepartmentDetailsResponseDTO;
import com.example.department_service.infrastructure.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DepartmentVOMapper {


//    @Mapping(target = "departmentName", source = "departmentName")
//    @Mapping(target = "description", source = "departmentDescription")
//    @Mapping(target = "code", source = "departmentCode")
    List<DepartmentDetailsResponseVO> toDepartmentDetailsResponseVO(List<DepartmentDetailsResponseDTO> departmentDetailsResponseDTO);


}
