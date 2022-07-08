package liquibase;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.querydsl.jpa.impl.JPAQuery;

import liquibase.entity.QEmployees;
import liquibase.persistence.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Application {

	@Autowired
	private EntityManager entityManager;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner init(EmployeeRepository employeeRepository) {
		return args -> {
			// find all male employees
			QEmployees qEmployee = QEmployees.employees;
			JPAQuery<QEmployees> findCountOfMaleEmployee = new JPAQuery<>(entityManager);
			findCountOfMaleEmployee.from(qEmployee).where(qEmployee.gender.eq("M"));
			System.out.printf("number of male employee is %s%n",findCountOfMaleEmployee.fetch().size());
			

		};
	}

}
