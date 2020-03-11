package by.it.academy.spring.homework.service;

import by.it.academy.spring.homework.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Optional<Employee> find(Long id);

    List<Employee> findAll();

    Employee addEmployee(Employee employee);

}
