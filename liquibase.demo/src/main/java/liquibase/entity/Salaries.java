package liquibase.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "salaries")

public class Salaries implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SalariesId id;

	@Column(name = "salary", nullable = false)
	private Integer salary;

	@Temporal(TemporalType.DATE)
	@Column(name = "to_date", nullable = false)
	private Date toDate;

	@ManyToOne
	@JoinColumn(name = "emp_no", referencedColumnName = "emp_no", insertable = false, updatable = false)
	private Employees employees;

}
