package menu.validator;

import java.util.List;

public class InputValidator {

    public List<String> validateCoachesName(String input) {
        String[] rawCoachesName = input.split(",");
        return List.of(rawCoachesName);
    }
}
