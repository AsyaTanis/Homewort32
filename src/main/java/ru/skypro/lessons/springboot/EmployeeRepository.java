package ru.skypro.lessons.springboot;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {

    List<Employee> getAllEmployees();

    Integer getSalarySum();

    Employee getMinSalary();

    Employee getMaxSalary();

    List<Employee> getAllEmployeesWithSalaryHigherThenAvg();
}