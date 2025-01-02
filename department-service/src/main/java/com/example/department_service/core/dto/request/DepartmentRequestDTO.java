package com.example.department_service.core.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class DepartmentRequestDTO {

    @NotEmpty
    private String departmentName;
    private String departmentDescription;
    @NotEmpty
    private String departmentCode;

}
