package liquibase.persistence;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import liquibase.entity.Employees;

public interface EmployeeRepository extends CrudRepository<Employees, Long>, QuerydslPredicateExecutor<Employees> {
}
