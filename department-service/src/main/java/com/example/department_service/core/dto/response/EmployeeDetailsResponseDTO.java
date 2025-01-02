package com.example.department_service.core.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class EmployeeDetailsResponseDTO {


    private String firstName;
    private String lastName;
    private String email;


}
