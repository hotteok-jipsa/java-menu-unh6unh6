package menu.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import menu.dto.CoachMenuByDayDto;
import menu.enums.Category;
import menu.enums.DayOfWeek;

public class CoachMenuByDay {

    private final Coach coach;
    private final List<String> selectedMenus = new ArrayList<>();

    public CoachMenuByDay(CategoryByDay categoryByDay, Coach coach) {
        selectMenu(categoryByDay);
        this.coach = coach;
    }

    public CoachMenuByDayDto getCoachMenuByDayDto() {
        return new CoachMenuByDayDto(
                coach.getName(),
                Collections.unmodifiableList(selectedMenus)
        );
    }

    private void selectMenu(CategoryByDay categoryByDay) {
        for (DayOfWeek day : DayOfWeek.values()) {
            Category todayCategory = categoryByDay.getCategoryByDay(day);
            selectMenuByDay(todayCategory);
        }
    }

    private void selectMenuByDay(Category todayCategory) {
        List<String> categoryMenus = Menus.categoryMenu.get(todayCategory);
        String menu;
        while (true) {
            menu = Randoms.shuffle(categoryMenus).get(0);
            if (canSelectThisMenu(menu)) {
                break;
            }
        }
        selectedMenus.addLast(menu);
    }

    private boolean canSelectThisMenu(String menu) {
        return !coach.isCantEatMenu(menu) && !selectedMenus.contains(menu);
    }
}
