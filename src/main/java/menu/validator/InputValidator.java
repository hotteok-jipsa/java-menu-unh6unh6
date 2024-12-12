package menu.validator;

import java.util.ArrayList;
import java.util.List;

public class InputValidator {

    private static final String COMMA = ",";

    public List<String> validateCoachesName(String input) {
        String[] rawCoachesName = input.split(COMMA);
        return List.of(rawCoachesName);
    }

    public List<String> validateCantEatMenus(String input) {
        String[] rawCantEatMenus = input.split(COMMA);
        List<String> cantEatMenus = new ArrayList<>();
        for (String menu : rawCantEatMenus) {
            if (!menu.isBlank()) {
                cantEatMenus.add(menu);
            }
        }
        return cantEatMenus;
    }
}
