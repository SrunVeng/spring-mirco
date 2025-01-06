package com.example.payrollservice.core.dto.response;

import com.example.payrollservice.common.enumeration.JobGrade;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponseDTO {

    private Long Id;
    private String firstName;
    private String lastName;
    private String email;
    private String jobTitle;
    private JobGrade jobGrade;
}