package ru.skypro.lessons.springboot;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {

    List<Employee> getAllEmployees();

    Integer getSalarySum();

    Optional<Integer> getMinSalary();

    Optional<Integer> getMaxSalary();

    List<Employee> getAllEmployeesWithSalaryHigherThenAvg();
}
