package com.capg;

import com.capg.config.JavaConfig;
import com.capg.entities.Employee;
import com.capg.service.IEmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Scanner;


public class ProjectMain {

    public static void main(String[] args) {
        //
        //ApplicationContext is the specification
        // implementation we are using is AnnotationConfigApplicationContext
        //
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //
        //registering configuration class in which configurations are kept
        //
        Class configurationClass= JavaConfig.class;
        context.register(configurationClass);
        context.refresh();
        context.registerShutdownHook();
        //
        //fetching bean by name
        //
        IEmployeeService service = context.getBean(IEmployeeService.class);
         Scanner in = new Scanner(System.in);
        System.out.println("Enter id to fetch : ");
        
        System.out.println(service.fetchByID(in.nextInt()));
    }


}