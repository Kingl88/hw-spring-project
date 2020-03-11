package by.it.academy.spring.homework.service.impl;

import by.it.academy.spring.homework.model.Department;
import by.it.academy.spring.homework.repository.DepartmentRepository;
import by.it.academy.spring.homework.service.DepartmentService;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Optional<Department> find(Long id) {
        return departmentRepository.findById(id);
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department addDepartment(@NonNull Department department) {
        return departmentRepository.save(department);
    }
}
