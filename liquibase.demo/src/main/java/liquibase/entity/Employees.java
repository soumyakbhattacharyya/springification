package liquibase.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "employees")
public class Employees implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "emp_no", nullable = false)
	private Integer empNo;

	@Temporal(TemporalType.DATE)
	@Column(name = "birth_date", nullable = false)
	private Date birthDate;

	@Column(name = "first_name", nullable = false, length = 14)
	private String firstName;

	@Column(name = "last_name", nullable = false, length = 16)
	private String lastName;

	@Column(name = "gender", nullable = false, length = 1)
	private String gender;

	@Temporal(TemporalType.DATE)
	@Column(name = "hire_date", nullable = false)
	private Date hireDate;

	@OneToMany(mappedBy = "employees")
	private List<Titles> listOfTitles;

	@OneToMany(mappedBy = "employees")
	private List<DeptEmp> listOfDeptEmp;

	@OneToMany(mappedBy = "employees")
	private List<DeptManager> listOfDeptManager;

	@OneToMany(mappedBy = "employees")
	private List<Salaries> listOfSalaries;

}
