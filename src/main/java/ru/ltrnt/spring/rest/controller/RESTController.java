package ru.ltrnt.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ltrnt.spring.rest.entity.Employee;
import ru.ltrnt.spring.rest.exception_handling.EmployeeIncorrectData;
import ru.ltrnt.spring.rest.exception_handling.NoSuchEmployeeException;
import ru.ltrnt.spring.rest.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);

        if (employee == null) {
            throw new NoSuchEmployeeException("No employee with ID = " + id + " in database");
        }

        return employee;
    }

}
