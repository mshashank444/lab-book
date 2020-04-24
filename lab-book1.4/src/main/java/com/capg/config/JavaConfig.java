package com.capg.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;

import com.capg.dao.EmployeeDaoImpl;
import com.capg.dao.IEmployeeDao;
import com.capg.entities.Employee;

@Configuration
@ComponentScan({"com.capg", "com.capg.service"})
public class JavaConfig {
	
	@Bean
	public IEmployeeDao iemployeeDao() {
		System.out.println("fisrt config");
		Employee employee1 = new Employee(100, "shubham");
		Employee employee2 = new Employee(105, "satyam");
		Employee employee3 = new Employee(101, "saurabh");
		Employee employee4 = new Employee(102, "sanju");
		Employee employee5 = new Employee(104, "shubhamkapoor");
		Employee employee6 = new Employee(103, "shubham_kapoor");
		
	    Map<Integer,Employee> store = new HashMap<>();
	    store.put(employee1.getId(), employee1);
	    store.put(employee2.getId(), employee2);
	    store.put(employee3.getId(), employee3);
	    store.put(employee4.getId(), employee4);
	    store.put(employee5.getId(), employee5);
	    store.put(employee6.getId(), employee6);
	    
	    IEmployeeDao employeeDao = new EmployeeDaoImpl();
	    employeeDao.setDao(store);
	    
	    return employeeDao;
	}

}
