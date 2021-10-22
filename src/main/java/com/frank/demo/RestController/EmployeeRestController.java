package com.frank.demo.RestController;

import com.frank.demo.Model.Employee;
import com.frank.demo.Service.EmployeeService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

    //http://localhost:4000/api/hello
    @GetMapping("/hello")
    public List<Employee> hello() {
        log.info("Se Listo  con exito el api rest");
        return employeeService.getAllEmpleados();
    }

    @GetMapping("/pinjas")
    public String pinjas() {
        log.info("Consultaste un pinjacito ");
        return "consultaste un pinjacito";
    }
}
