package com.example.department_service.application.mapper;


import com.example.department_service.application.dto.request.DepartmentRequestVO;
import com.example.department_service.application.dto.response.DepartmentDetailsResponseVO;
import com.example.department_service.application.dto.response.DepartmentResponseVO;
import com.example.department_service.core.dto.request.DepartmentRequestDTO;
import com.example.department_service.core.dto.response.DepartmentDetailsResponseDTO;
import com.example.department_service.core.dto.response.DepartmentResponseDTO;
import org.mapstruct.Mapper;
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
    DepartmentResponseVO toDepartmentResponseVO(DepartmentResponseDTO departmentResponseDTO);
    DepartmentRequestVO toDepartmentRequestVO(DepartmentRequestDTO departmentRequestDTO);


}
