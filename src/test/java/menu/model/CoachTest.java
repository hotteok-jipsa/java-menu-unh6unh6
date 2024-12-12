package menu.model;

import static menu.ExceptionMessage.COACH_NAME_LENGTH_INVALID_EXCEPTION;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CoachTest {

    @ParameterizedTest
    @ValueSource(strings = {"일", "다섯글자다"})
    void 코치의_이름의_길이가_2글자보다_적거나_4글자보다_많다면_예외를_발생시킨다(String name) {
        assertThatThrownBy(() -> new Coach(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(COACH_NAME_LENGTH_INVALID_EXCEPTION.message);
    }
}
