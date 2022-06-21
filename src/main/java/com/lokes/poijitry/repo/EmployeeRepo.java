package com.lokes.poijitry.repo;

import com.lokes.poijitry.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
