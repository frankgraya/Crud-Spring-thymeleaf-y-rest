/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frank.demo.Repository;

import com.frank.demo.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author frank
 */
@Repository("EmployeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
