package com.example.department_service.core.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

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
