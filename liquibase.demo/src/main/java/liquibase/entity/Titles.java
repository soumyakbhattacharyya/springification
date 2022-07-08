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
 * JPA entity class for "Titles"
 *
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "titles")
public class Titles implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TitlesId id;

	@Temporal(TemporalType.DATE)
	@Column(name = "to_date")
	private Date toDate;

	@ManyToOne
	@JoinColumn(name = "emp_no", referencedColumnName = "emp_no", insertable = false, updatable = false)
	private Employees employees;

}
