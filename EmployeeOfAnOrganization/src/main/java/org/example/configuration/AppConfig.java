package org.example.configuration;

import org.example.domain.Department;
import org.example.domain.Employee;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("bean")
    public Employee method1()
    {
        Employee employee = new Employee();
        employee.setEmpId(55);
        employee.setEmpName("Mimansa");
        employee.setEmpSalary(120000.0);
        return employee;
    }

    @Bean
    public Department method2()
    {
        Department department = new Department();
        department.setDeptId(111);
        department.setDeptName("Marketing");
        return department;
    }
}
