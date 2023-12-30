package com.rizvankarimov.springboot.service;

import com.rizvankarimov.springboot.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees(); // butun ishchilerin listesini elde etmek uchun
    public void saveEmployee(Employee employee); // ishchini elave etmek uchun
    public Employee getEmployee(int id); // ishchini id nomresine gore elde etmek uchun
    public void deleteEmployee(int id); // ishchini silmek uchun
}
