package com.example.department_service.core.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DepartmentDetailsResponseDTO {

    private String departmentName;
    private String departmentDescription;
    private String departmentCode;


}
