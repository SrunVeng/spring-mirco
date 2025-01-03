package com.example.employee_service.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class EmployeeDeatilsResponseVO {

    private String departmentName;
    private String description;
    private String code;
}
