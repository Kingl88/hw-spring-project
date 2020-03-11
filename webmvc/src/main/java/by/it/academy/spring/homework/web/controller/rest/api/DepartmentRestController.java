package by.it.academy.spring.homework.web.controller.rest.api;

import by.it.academy.spring.homework.model.Department;
import by.it.academy.spring.homework.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/departments")
public class DepartmentRestController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<List<Department>> getDepartment() {
        List<Department> department = departmentService.findAll();
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

}
