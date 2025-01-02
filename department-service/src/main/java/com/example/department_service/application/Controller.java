package com.example.department_service.application;


import com.example.department_service.application.dto.response.DepartmentDetailsResponseVO;
import com.example.department_service.application.mapper.DepartmentVOMapper;
import com.example.department_service.core.DepartmentService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
@RequiredArgsConstructor
public class Controller {

    private final DepartmentService departmentService;
    private final DepartmentVOMapper departmentVoMapper;

    @GetMapping
    public List<DepartmentDetailsResponseVO> getAllDepartmentsDetails() {

        List<DepartmentDetailsResponseVO> departmentDetailsResponseVOList =departmentVoMapper.toDepartmentDetailsResponseVO(departmentService.getAllDepartmentsDetails());
       // System.out.println(departmentDetailsResponseVOList);
        return departmentDetailsResponseVOList;

    }


}
