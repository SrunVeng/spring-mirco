package com.example.payrollservice.application.dto.response;

import com.example.payrollservice.common.enumeration.JobGrade;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@AllArgsConstructor
@ToString
public class EmployeeResponseVO {

        private Long Id;
        private String firstName;
        private String lastName;
        private String email;
        private String jobTitle;
        private JobGrade jobGrade;


}
