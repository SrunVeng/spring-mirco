package com.example.payrollservice.application.dto.response;

import com.example.payrollservice.common.enumeration.JobGrade;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponseVO {

    private Long Id;
    private String firstName;
    private String lastName;
    private String email;
    private String jobTitle;
    private JobGrade jobGrade;
}