package com.lokes.poijitry.configuration.excelgenerator;

import com.lokes.poijitry.repo.EmployeeRepo;
import com.lokes.poijitry.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ExcelDataUploadRunner implements CommandLineRunner {
    private final EmployeeRepo employeeRepo;
    private final EmployeeService employeeService;


    public ExcelDataUploadRunner(EmployeeRepo employeeRepo, EmployeeService employeeService) {
        this.employeeRepo = employeeRepo;
        this.employeeService = employeeService;
    }

    @Override
    public void run(String... args) throws Exception {
        employeeRepo.saveAll(employeeService.excelToEntity());
    }
}
