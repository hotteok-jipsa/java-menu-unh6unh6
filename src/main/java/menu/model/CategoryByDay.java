package menu.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;
import menu.enums.Category;
import menu.enums.DayOfWeek;

public class CategoryByDay {
    private static final int MAXIMUM_CATEGORY_COUNT = 2;

    private final Map<DayOfWeek, Category> categoryByDay = new EnumMap<>(DayOfWeek.class);

    public CategoryByDay() {
        setCategoryByDay();
    }

    public Category getCategoryByDay(DayOfWeek dayOfWeek) {
        for (Entry<DayOfWeek, Category> entry : categoryByDay.entrySet()) {
            if (entry.getKey().equals(dayOfWeek)) {
                return entry.getValue();
            }
        }
        throw new IllegalStateException();
    }

    private void setCategoryByDay() {
        for (DayOfWeek day : DayOfWeek.values()) {
            Category thisCategory = getValidatedRandomCategory();
            categoryByDay.put(day, thisCategory);
        }
    }

    private Category getValidatedRandomCategory() {
        Category category;
        while (true) {
            category = getRandomCategory();
            if (weekCategoryCount(category) < MAXIMUM_CATEGORY_COUNT) {
                return category;
            }
        }
    }

    private Category getRandomCategory() {
        int randomCategoryNumber = Randoms.pickNumberInRange(1, 5);
        return Category.of(randomCategoryNumber);
    }

    private int weekCategoryCount(Category target) {
        int categoryCount = 0;
        for (Category category : categoryByDay.values()) {
            if (category.equals(target)) {
                categoryCount++;
            }
        }
        return categoryCount;
    }
}
