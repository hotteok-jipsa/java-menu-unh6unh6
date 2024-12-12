package menu.model;

import static menu.ExceptionMessage.COACHES_NUMBER_INVALID_EXCEPTION;

import java.util.Collections;
import java.util.List;

public class Coaches {
    private static final int MINIMUM_COACHES_NUMBER = 2;
    private static final int MAXIMUM_COACHES_NUMBER = 5;

    private final List<Coach> coaches;

    public Coaches(final List<Coach> coaches) {
        validateCoachesNumber(coaches);
        this.coaches = coaches;
    }

    public List<Coach> getCoaches() {
        return Collections.unmodifiableList(coaches);
    }

    private void validateCoachesNumber(List<Coach> coaches) {
        int coachesNumber = coaches.size();
        if (coachesNumber < MINIMUM_COACHES_NUMBER || coachesNumber > MAXIMUM_COACHES_NUMBER) {
            throw new IllegalArgumentException(COACHES_NUMBER_INVALID_EXCEPTION.message);
        }
    }
}
