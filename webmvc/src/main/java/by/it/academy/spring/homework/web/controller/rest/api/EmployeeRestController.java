package by.it.academy.spring.homework.web.controller.rest.api;

import by.it.academy.spring.homework.model.Employee;
import by.it.academy.spring.homework.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/employees")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployee() {
        List<Employee> employee = employeeService.findAll();
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

}