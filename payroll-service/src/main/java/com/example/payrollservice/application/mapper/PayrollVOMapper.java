package com.example.payrollservice.application.mapper;


import com.example.payrollservice.application.dto.response.PayrollDetailsResponseVO;
import com.example.payrollservice.core.dto.response.PayrollDetailsResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;


@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PayrollVOMapper {

    List<PayrollDetailsResponseVO> toListPayrollDetailsResponseVO(List<PayrollDetailsResponseDTO> payrollDetailsResponseDTO);

}
