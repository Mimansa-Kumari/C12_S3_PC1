package org.example;

import org.example.configuration.AppConfig;
import org.example.domain.Department;
import org.example.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = applicationContext.getBean("bean",Employee.class);
        System.out.println(employee);
    }
}
