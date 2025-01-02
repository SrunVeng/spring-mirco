package com.example.department_service.core;

import com.example.department_service.core.dto.request.DepartmentRequestDTO;
import com.example.department_service.core.dto.response.DepartmentDetailsResponseDTO;
import com.example.department_service.core.dto.response.DepartmentResponseDTO;

import java.util.List;

public interface DepartmentService {

    List<DepartmentDetailsResponseDTO> getAllDepartmentsDetails();
    DepartmentResponseDTO getDepartmentNameById(Long id);
    DepartmentResponseDTO getDepartmentByCode(String code);
    DepartmentResponseDTO createDepartment(DepartmentRequestDTO departmentRequestDTO);

}
