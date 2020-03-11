package by.it.academy.spring.homework.service;

import by.it.academy.spring.homework.model.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    Optional<Department> find(Long id);

    List<Department> findAll();

    Department addDepartment(Department department);
}
