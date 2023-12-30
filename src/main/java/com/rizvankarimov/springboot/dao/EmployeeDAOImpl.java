package com.rizvankarimov.springboot.dao;

import com.rizvankarimov.springboot.entity.Employee;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
       Session session = entityManager.unwrap(Session.class);
       Query<Employee> query = session.createQuery("from Employee", Employee.class);
       List<Employee> allEmployees = query.getResultList();

         return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public Employee getEmployee(int id) {
        return null;
    }

    @Override
    public void deleteEmployee(int id) {

    }
}
