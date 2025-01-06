package com.example.payrollservice.core.dto.response;

import com.example.payrollservice.common.enumeration.JobGrade;
import jakarta.persistence.Column;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@ToString
public class EmployeeResponseDTO {

    private Long Id;
    private String firstName;
    private String lastName;
    private String email;
    private String jobTitle;
    private JobGrade jobGrade;


}
