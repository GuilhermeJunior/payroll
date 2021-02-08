package com.gui.Payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gui.Payroll.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
