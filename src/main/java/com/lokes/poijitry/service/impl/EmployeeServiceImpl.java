package com.lokes.poijitry.service.impl;

import com.lokes.poijitry.entity.Employee;
import com.lokes.poijitry.service.EmployeeService;
import com.poiji.bind.Poiji;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.InputStream;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Value("${filePath}")
    public String FILE_PATH;

    @Override
    public List<Employee> excelToEntity() {
        File file = new File(FILE_PATH);
        List<Employee> employees = Poiji.fromExcel(file, Employee.class);
        return employees;
    }
}
