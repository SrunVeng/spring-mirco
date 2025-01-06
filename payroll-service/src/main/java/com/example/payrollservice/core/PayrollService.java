package com.example.payrollservice.core;

import com.example.payrollservice.core.dto.response.PayrollDetailsResponseDTO;

import java.util.List;

public interface PayrollService {

    List<PayrollDetailsResponseDTO> getAllPayrolls();
}
