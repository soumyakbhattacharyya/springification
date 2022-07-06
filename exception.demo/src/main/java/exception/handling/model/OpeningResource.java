package exception.handling.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OpeningResource {

	private String id;

	@NotNull
	private String title;

	private String description;

}
