package com.example.department_service.application.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DepartmentDetailsResponseVO {

    private String departmentName;
    private String description;
    private String code;
}
