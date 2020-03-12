package by.it.academy.spring.homework.web.controller.rest.api;

import by.it.academy.spring.homework.model.Employee;
import by.it.academy.spring.homework.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping(value = "/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id,
                                                   @RequestBody Employee newEmployee) {
        Employee employee = employeeService.find(id).orElse(null);
        if (employee == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        employee.setName(newEmployee.getName());
        employee.setSurname(newEmployee.getSurname());

        newEmployee = employeeService.update(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable("id") Long id) {
        employeeService.delete(id);
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee( @RequestBody Employee newEmployee) {
        newEmployee = employeeService.addEmployee(newEmployee);
        return new ResponseEntity<>(newEmployee, HttpStatus.OK);
    }
}