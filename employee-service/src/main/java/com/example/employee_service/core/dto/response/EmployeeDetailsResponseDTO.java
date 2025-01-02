package com.example.employee_service.application.dto.response;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class EmployeeDetailsResponseVO {


    private String firstName;
    private String lastName;
    private String email;


}
