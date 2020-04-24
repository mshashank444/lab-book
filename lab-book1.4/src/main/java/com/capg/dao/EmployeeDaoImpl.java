package com.capg.dao;

import com.capg.entities.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @Repository is recommended instead of @Component on EmployeeDaoImpl to show intention
 * Both @Repository and @Component does same job
 */
// @Repository
public class EmployeeDaoImpl implements IEmployeeDao{

    private Map<Integer,Employee> store = new HashMap<>();

    public EmployeeDaoImpl(){
    }
    
    public void setDao(Map<Integer,Employee> store) {
    	
    	this.store = store;
    	System.out.println(this.store);
    }
    
    public Employee fetchByID(int id) {
    	Employee employee = store.get(id);
    	
    	System.out.println(employee);
    	return employee;
    }

	@Override
	public String toString() {
		return "EmployeeDaoImpl [store=" + store + "]";
	}

}
