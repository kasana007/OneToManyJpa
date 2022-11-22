package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.employee;

public interface employeeRepository extends JpaRepository<employee, Integer> {

}
