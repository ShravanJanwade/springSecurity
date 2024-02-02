package spring.security.dbms.sqlsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.security.dbms.sqlsecurity.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    
}
