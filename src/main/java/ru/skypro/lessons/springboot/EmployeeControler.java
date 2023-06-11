package ru.skypro.lessons.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeControler {

    private final EmployeeService employeeService;

    public EmployeeControler(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/salary/all")
    public List<Employee> showAll() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/salary/sum")
    public Integer showSum() {
        return employeeService.getSalarySum();
    }

    @GetMapping("/salary/min")
    public Employee showMin() {
        return employeeService.getMinSalary();
    }

    @GetMapping("/salary/max")
    public Employee showMax() {
        return employeeService.getMaxSalary();
    }

    @GetMapping("/salary/higherThenAvg")
    public List<Employee> showHigherThenAvg() {
        return employeeService.getAllEmployeesWithSalaryHigherThenAvg();
    }
}