package by.it.academy.spring.homework.web.controller;

import by.it.academy.spring.homework.model.Department;
import by.it.academy.spring.homework.model.Employee;
import by.it.academy.spring.homework.service.DepartmentService;
import by.it.academy.spring.homework.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllEmployees(Model model) {
        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employees", employees);
        return "employee/all";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addEmployeePage(Model model) {
        model.addAttribute("departments", departmentService.findAll());
        model.addAttribute("employee", new Employee());
        return "employee/add";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addEmployeeSubmit(@Validated @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "employee/add";
        }
        employeeService.addEmployee(employee);
        return "redirect:/employees";
    }
}