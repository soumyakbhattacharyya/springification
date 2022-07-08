package liquibase.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Composite primary key for entity "DeptEmp" ( stored in table "dept_emp" )
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class DeptEmpId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "emp_no")
	private Integer empNo;

	@Column(name = "dept_no")
	private String deptNo;

}
