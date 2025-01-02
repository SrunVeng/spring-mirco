package com.example.department_service.application.mapper;


import com.example.department_service.application.dto.response.DepartmentDetailsResponseVO;
import com.example.department_service.core.dto.response.DepartmentDetailsResponseDTO;
import com.example.department_service.infrastructure.entity.Department;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DepartmentVOMapper {

    @IterableMapping(qualifiedByName = "mapDepartment")
    List<DepartmentDetailsResponseVO> toDepartmentDetailsResponseVO(List<DepartmentDetailsResponseDTO> departmentDetailsResponseDTO);

    @Named("mapDepartment")
    @Mapping(target = "departmentName", source = "departmentName")
    @Mapping(target = "description", source = "departmentDescription")
    @Mapping(target = "code", source = "departmentCode")
    DepartmentDetailsResponseVO mapDepartment(DepartmentDetailsResponseDTO departmentDetailsResponseDTO);





}
