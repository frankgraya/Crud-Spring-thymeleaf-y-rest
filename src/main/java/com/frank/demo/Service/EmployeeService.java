/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.frank.demo.Service;

import com.frank.demo.Model.Employee;
import java.util.List;

/**
 *
 * @author frank
 */
public interface EmployeeService {

    public Employee saveEmployee(Employee employee);

    public void delete(long id);

    public Employee findById(long id);

    public List<Employee> findAll();

}
