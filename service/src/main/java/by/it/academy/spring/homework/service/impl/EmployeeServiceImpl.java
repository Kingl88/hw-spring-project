package by.it.academy.spring.homework.service.impl;

import by.it.academy.spring.homework.model.Employee;
import by.it.academy.spring.homework.repository.EmployeeRepository;
import by.it.academy.spring.homework.service.EmployeeService;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional(readOnly = true, timeout = 5)
    public Optional<Employee> find(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true, timeout = 5)
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public Employee addEmployee(@NonNull Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    @Transactional(timeout = 50)
    public Employee update (@NonNull Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public void delete (Long id) {
        employeeRepository.deleteById(id);
    }

}
