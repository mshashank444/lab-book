package com.capg.service;

import com.capg.entities.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee fetchByID(int id);
    void display();

}
