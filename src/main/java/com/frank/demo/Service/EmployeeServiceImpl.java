package com.frank.demo.Service;

import com.frank.demo.Model.Employee;
import com.frank.demo.Repository.EmployeeRepository;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author frank
 */
@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmpleados() {
        log.info("Se Listo getAllEmpleados con exito ");
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        log.info("Se guaro saveEmployee con exito ");
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional< Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);
    }

}
