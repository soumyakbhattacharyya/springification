
package liquibase.entity;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * Composite primary key for entity "DeptManager" ( stored in table
 * "dept_manager" )
 */

public class DeptManagerId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "emp_no")
	private Integer empNo;

	@Column(name = "dept_no")
	private String deptNo;

}
