package auditing.rest.error;

public class OpeningRegistrationException extends BadRequestAlertException {

    private static final long serialVersionUID = 1L;

    public OpeningRegistrationException() {
        super(ErrorConstants.TITLE_ALREADY_USED_TYPE, "Title already exists!", "openingManagement", "titleExists");
    }
}
