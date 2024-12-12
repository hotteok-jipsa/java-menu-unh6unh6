package menu.model;

import static menu.ExceptionMessage.COACH_NAME_LENGTH_INVALID_EXCEPTION;

public class Coach {

    private static final int MINIMUM_NAME_LENGTH = 2;
    private static final int MAXIMUM_NAME_LENGTH = 4;

    private final String name;

    public Coach(String name) {
        validateNameLength(name);
        this.name = name;
    }

    private void validateNameLength(String name) {
        if (name.length() < MINIMUM_NAME_LENGTH || name.length() > MAXIMUM_NAME_LENGTH) {
            throw new IllegalArgumentException(COACH_NAME_LENGTH_INVALID_EXCEPTION.message);
        }
    }
}
