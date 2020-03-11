package by.it.academy.spring.homework.web.controller;

import by.it.academy.spring.homework.model.Department;
import by.it.academy.spring.homework.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllDepartment(Model model) {
        List<Department> departments = departmentService.findAll();
        model.addAttribute("department", departments);
        return "department/all";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addDepartmentPage(Model model) {
        model.addAttribute("department", new Department());
        return "department/add";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addDepartmentSubmit(@Validated @ModelAttribute("department") Department department, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "department/add";
        }
        departmentService.addDepartment(department);
        return "redirect:/departments";
    }
}
