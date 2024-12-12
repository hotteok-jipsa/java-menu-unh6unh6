package menu.model;

import static menu.ExceptionMessage.COACH_NAME_LENGTH_INVALID_EXCEPTION;

import java.util.ArrayList;
import java.util.List;

public class Coach {

    private static final int MINIMUM_NAME_LENGTH = 2;
    private static final int MAXIMUM_NAME_LENGTH = 4;

    private final String name;

    private List<String> cantEatMenu = new ArrayList<>();

    public Coach(String name) {
        validateNameLength(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void validateNameLength(String name) {
        if (name.length() < MINIMUM_NAME_LENGTH || name.length() > MAXIMUM_NAME_LENGTH) {
            throw new IllegalArgumentException(COACH_NAME_LENGTH_INVALID_EXCEPTION.message);
        }
    }
}
