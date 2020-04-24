package com.capg.dao;

import com.capg.entities.Employee;

import java.util.List;
import java.util.Map;

public interface IEmployeeDao {

	Employee fetchByID(int id);
	public void setDao(Map<Integer,Employee> store);
}
