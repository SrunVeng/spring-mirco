package com.example.department_service.application.mapper;


import com.example.department_service.application.dto.request.DepartmentRequestVO;
import com.example.department_service.application.dto.response.DepartmentDetailsResponseVO;
import com.example.department_service.application.dto.response.DepartmentResponseVO;
import com.example.department_service.core.dto.request.DepartmentRequestDTO;
import com.example.department_service.core.dto.response.DepartmentDetailsResponseDTO;
import com.example.department_service.core.dto.response.DepartmentResponseDTO;
import com.example.department_service.infrastructure.entity.Department;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DepartmentVOMapper {



    @IterableMapping(qualifiedByName = "toDepartmentDetailsResponseVO")
    List<DepartmentDetailsResponseVO> toDepartmentDetailsResponseVO(List<DepartmentDetailsResponseDTO> departmentDetailsResponseDTO);


    @Named("toDepartmentDetailsResponseVO")
    @Mapping(target = "departmentName", source = "departmentName")
    @Mapping(target = "description", source = "departmentDescription")
    @Mapping(target = "code", source = "departmentCode")
    DepartmentDetailsResponseVO toDepartmentDetailsResponseVO(DepartmentDetailsResponseDTO departmentDetailsResponseDTO);



    DepartmentResponseVO toDepartmentResponseVO(DepartmentResponseDTO departmentResponseDTO);




    @Mapping(target = "departmentDescription", source = "description")
    @Mapping(target = "departmentCode", source = "code")
    DepartmentRequestDTO toDepartmentRequestDTO(DepartmentRequestVO departmentRequestVO);







}
