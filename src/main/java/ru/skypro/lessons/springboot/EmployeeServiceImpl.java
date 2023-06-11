package ru.skypro.lessons.springboot;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public Integer getSalarySum() {
        return employeeRepository.getSalarySum();
    }

    @Override
    public Employee getMinSalary() {
        return employeeRepository.getMinSalary();
    }

    @Override
    public Employee getMaxSalary() {
        return employeeRepository.getMaxSalary();
    }

    @Override
    public List<Employee> getAllEmployeesWithSalaryHigherThenAvg() {
        return employeeRepository.getAllEmployeesWithSalaryHigherThenAvg();
    }
}