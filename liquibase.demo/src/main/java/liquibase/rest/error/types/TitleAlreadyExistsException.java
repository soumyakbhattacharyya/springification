package liquibase.rest.error.types;

public class TitleAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TitleAlreadyExistsException() {
		super("Title has already been used!");
	}
}
