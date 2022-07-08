
package liquibase.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Composite primary key for entity "Titles" ( stored in table "titles" )
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class TitlesId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "emp_no")
	private Integer empNo;

	@Column(name = "title")
	private String title;

	@Column(name = "from_date")
	private Date fromDate;

}
