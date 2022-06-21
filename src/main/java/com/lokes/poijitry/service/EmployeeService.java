package com.lokes.poijitry.service;

import com.lokes.poijitry.entity.Employee;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface EmployeeService {
    List<Employee> excelToEntity();
}
