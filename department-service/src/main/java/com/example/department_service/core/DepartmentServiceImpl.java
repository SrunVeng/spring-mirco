package com.example.department_service.core;


import com.example.department_service.core.dto.response.DepartmentDetailsResponseDTO;
import com.example.department_service.core.mapper.DepartmentMapper;
import com.example.department_service.infrastructure.entity.Department;
import com.example.department_service.infrastructure.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;


    @Override
    public List<DepartmentDetailsResponseDTO> getAllDepartmentsDetails() {

        List<Department> departmentList = departmentRepository.findAll();

        return departmentMapper.toDepartmentDetailsResponseDTO(departmentList);




    }








}
