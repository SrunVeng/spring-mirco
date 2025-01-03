package com.example.employee_service.application.dto.response;

import com.example.employee_service.common.enumeration.JobGrade;
import com.example.employee_service.infrastructure.entity.Department;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class EmployeeDeatilsResponseVO {

    private String firstName;
    private String lastName;
    private String email;
    private Long departmentId;
    private String jobTitle;
    private JobGrade jobGrade;

}
