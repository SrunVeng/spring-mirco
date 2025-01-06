package com.example.payrollservice.infrastructure.repository;

import com.example.payrollservice.infrastructure.entity.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayrollRepository extends JpaRepository<Payroll, Long> {

}
