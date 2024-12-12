package menu.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import menu.enums.Category;
import menu.enums.DayOfWeek;

public class CoachMenuByDay {

    private final Coach coach;
    private final List<String> selectedMenus = new ArrayList<>();

    public CoachMenuByDay(CategoryByDay categoryByDay, Coach coach) {
        this.coach = coach;
    }

    private void selectMenu(CategoryByDay categoryByDay) {
        for (DayOfWeek day : DayOfWeek.values()) {
            Category todayCategory = categoryByDay.getCategoryByDay(day);
            selectMenuByDay(todayCategory);
        }
    }

    private void selectMenuByDay(Category todayCategory) {
        List<String> categoryMenus = Menus.categoryMenu.get(todayCategory);
        String menu = Randoms.shuffle(categoryMenus).get(0);
        selectedMenus.addLast(menu);
    }
}
