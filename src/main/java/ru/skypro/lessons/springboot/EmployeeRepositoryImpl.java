package ru.skypro.lessons.springboot;

import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final List<Employee> employees = List.of(new Employee("Ivan", 50_000),
            new Employee("Ivan1", 51_000),
            new Employee("Ivan2", 52_000),
            new Employee("Ivan3", 53_000),
            new Employee("Ivan4", 54_000),
            new Employee("Ivan5", 55_000));

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }


    @Override
    public Integer getSalarySum() {

        Integer list = employees.stream()
                .map(Employee::getSalary)
                .reduce(0, Integer::sum);

        return list;
    }

    @Override
    public Employee getMinSalary() {

        return employees.stream()
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow(EmployeeNotFoundExeption::new);
    }

    @Override
    public Employee getMaxSalary() {

        return employees.stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow(EmployeeNotFoundExeption::new);
    }

    @Override
    public List<Employee> getAllEmployeesWithSalaryHigherThenAvg() {

        List<Employee> list = employees.stream()
                .filter(employee -> employee.getSalary() > getSalarySum() / employees.size())
                .toList();
        return list;
    }
}