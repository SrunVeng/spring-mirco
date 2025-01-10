package com.example.employee_service.core.dto.response;


import com.example.employee_service.common.enumeration.JobGrade;
import com.example.employee_service.infrastructure.entity.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class EmployeeDetailsResponseDTO {


    private Long Id;
    private String firstName;
    private String lastName;
    private String email;
    private Long departmentId;
    private String departmentName;
    private String departmentDescription;
    private String jobTitle;
    private JobGrade jobGrade;


}
