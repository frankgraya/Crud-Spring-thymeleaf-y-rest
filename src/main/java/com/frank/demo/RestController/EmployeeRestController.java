package com.frank.demo.RestController;

import com.frank.demo.Model.Employee;
import com.frank.demo.Service.EmployeeService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api")
//http://localhost:4000/api
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee save(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> employee() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee mostrar(@PathVariable Integer id) {
        return employeeService.findById(id);
    }

    @PutMapping("/employees/{id}")
    public Employee update(@RequestBody Employee employee, @PathVariable Integer id) {
        Employee employeeActual = employeeService.findById(id);
        employeeActual.setFirstName(employee.getFirstName());
        employeeActual.setLastName(employee.getLastName());
        employeeActual.setEmail(employee.getEmail());
        return employeeService.saveEmployee(employeeActual);
    }

    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable Integer id) {
        employeeService.delete(id);
    }
}
