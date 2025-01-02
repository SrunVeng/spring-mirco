package com.example.department_service.core.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class DepartmentDetailsResponseDTO {

    private  String departmentName;
    private  String departmentDescription;
    private  String departmentCode;
    private List<EmployeeDetailsResponseDTO> employeeDetailsResponseDTO;

}
