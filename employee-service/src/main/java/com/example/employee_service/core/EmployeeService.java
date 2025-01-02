package com.example.department_service.core;

import com.example.department_service.application.dto.response.DepartmentDetailsResponseVO;
import com.example.department_service.core.dto.response.DepartmentDetailsResponseDTO;

import java.util.List;

public interface DepartmentService {

    List<DepartmentDetailsResponseDTO> getAllDepartmentsDetails();


}
