package menu.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.EnumMap;
import java.util.Map;
import menu.enums.Category;
import menu.enums.DayOfWeek;

public class CategoryByDay {
    private final Map<DayOfWeek, Category> categoryByDay = new EnumMap<>(DayOfWeek.class);

    public void setCategoryByDay() {
        for (DayOfWeek day : DayOfWeek.values()) {
            categoryByDay.put(day, getRandomCategory());
        }
    }

    private Category getRandomCategory() {
        int randomCategoryNumber = Randoms.pickNumberInRange(1, 5);
        return Category.of(randomCategoryNumber);
    }
}
