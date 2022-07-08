package liquibase.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * JPA entity class for "DeptManager"
 *
 *
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "dept_manager")
public class DeptManager implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private DeptManagerId id;

	@Temporal(TemporalType.DATE)
	@Column(name = "from_date", nullable = false)
	private Date fromDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "to_date", nullable = false)
	private Date toDate;

	@ManyToOne
	@JoinColumn(name = "dept_no", referencedColumnName = "dept_no", insertable = false, updatable = false)
	private Departments departments;

	@ManyToOne
	@JoinColumn(name = "emp_no", referencedColumnName = "emp_no", insertable = false, updatable = false)
	private Employees employees;

}
