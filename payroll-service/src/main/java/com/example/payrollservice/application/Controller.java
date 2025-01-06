package com.example.payrollservice.application;

import com.example.payrollservice.application.dto.response.PayrollDetailsResponseVO;
import com.example.payrollservice.application.mapper.PayrollVOMapper;
import com.example.payrollservice.core.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/payroll")
@RequiredArgsConstructor
public class Controller {

    private final PayrollService payrollService;
    private final PayrollVOMapper payrollVOMapper;

    @GetMapping("/all")
    public List<PayrollDetailsResponseVO> getAllPayrolls() {
        return payrollVOMapper.toListPayrollDetailsResponseVO(payrollService.getAllPayrolls());
    }
}
