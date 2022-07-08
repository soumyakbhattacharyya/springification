package liquibase.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "departments")
public class Departments implements Serializable {

	@Id
	@Column(name = "dept_no", nullable = false, length = 4)
	private String deptNo;

	@Column(name = "dept_name", nullable = false, length = 40)
	private String deptName;

	@OneToMany(mappedBy = "departments")
	private List<DeptEmp> listOfDeptEmp;

	@OneToMany(mappedBy = "departments")
	private List<DeptManager> listOfDeptManager;

}
