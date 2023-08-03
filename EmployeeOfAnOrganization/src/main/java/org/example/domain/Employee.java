package org.example.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int empId;
    private String empName;
    private double empSalary;

    @Autowired
    private Department department;

    public Employee() {
    }

    public Employee(int empId, String empName, double empSalary, Department department) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee : " +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", department=" + department;
    }
}
