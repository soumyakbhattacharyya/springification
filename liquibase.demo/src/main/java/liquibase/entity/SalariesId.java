package liquibase.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Composite primary key for entity "Salaries" ( stored in table "salaries" )
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Embeddable
public class SalariesId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "emp_no")
	private Integer empNo;
	@Column(name = "from_date")
	private Date fromDate;

}
