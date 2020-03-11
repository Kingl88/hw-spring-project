package by.it.academy.spring.homework.repository;

import by.it.academy.spring.homework.model.Department;
import by.it.academy.spring.homework.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
    List<Department> findAll();
}
