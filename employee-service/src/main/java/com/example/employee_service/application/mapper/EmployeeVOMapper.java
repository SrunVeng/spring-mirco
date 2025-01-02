package com.example.employee_service.application.mapper;



import com.example.employee_service.application.dto.response.EmployeeDetailsResponseVO;
import com.example.employee_service.core.dto.response.EmployeeDetailsResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;




@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployeeVOMapper {


        EmployeeDetailsResponseVO toEmployeeDetailsResponseVO(EmployeeDetailsResponseDTO employeeDetailsResponseDTO);





}
