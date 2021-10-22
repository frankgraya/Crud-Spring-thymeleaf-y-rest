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

    List<Employee> getAllEmpleados();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);

}
