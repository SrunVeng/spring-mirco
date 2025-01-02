package com.example.department_service.application.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DepartmentRequestVO {

    @NotEmpty
    private String departmentName;
    private String departmentDescription;
    @NotEmpty
    private String departmentCode;
}
