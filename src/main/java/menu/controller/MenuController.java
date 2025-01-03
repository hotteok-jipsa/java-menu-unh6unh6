package menu.controller;

import java.util.ArrayList;
import java.util.List;
import menu.model.CategoryByDay;
import menu.model.Coach;
import menu.model.CoachMenuByDay;
import menu.model.Coaches;
import menu.model.CoachesMenuByday;
import menu.validator.InputValidator;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {

    private final InputView inputView;
    private final OutputView outputView;
    private final InputValidator inputValidator;

    public MenuController(InputView inputView, OutputView outputView, InputValidator inputValidator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.inputValidator = inputValidator;
    }

    public void start() {
        inputView.printStartGuideMessage();
        Coaches coaches = getCoaches();
        getAndSetCantEatMenu(coaches);
        CategoryByDay categoryByDay = new CategoryByDay();
        CoachesMenuByday coachesMenuByday = getCoachesMenuByDay(coaches, categoryByDay);
        outputView.printResultGuideMessage();
        outputView.printCategoryByDay(categoryByDay.getCategoryByDayDtos());
        outputView.printCoachesMenus(coachesMenuByday.getCoachMenuByDayDtos());
        outputView.printFinishMessage();
    }

    private Coaches getCoaches() {
        try {
            inputView.printCoachNameInputGuideMessage();
            String input = inputView.getInput();
            List<String> rawCoachesName = inputValidator.validateCoachesName(input);
            return new Coaches(getRawCoaches(rawCoachesName));
        } catch (IllegalArgumentException e) {
            outputView.printErrorMessage(e);
            return getCoaches();
        }
    }

    private List<Coach> getRawCoaches(List<String> rawCoachesName) {
        List<Coach> coaches = new ArrayList<>();
        for (String cacheName : rawCoachesName) {
            coaches.add(new Coach(cacheName));
        }
        return coaches;
    }

    private void getAndSetCantEatMenu(Coaches coaches) {
        for (Coach coach : coaches.getCoaches()) {
            getAndSetCantEatMenusByCoach(coach);
        }
    }

    private void getAndSetCantEatMenusByCoach(Coach coach) {
        try {
            inputView.printCantEatMenuInputGuideMessage(coach.getName());
            String input = inputView.getInput();
            List<String> cantEatMenus = inputValidator.validateCantEatMenus(input);
            coach.setCantEatMenus(cantEatMenus);
        } catch (IllegalArgumentException e) {
            outputView.printErrorMessage(e);
            getAndSetCantEatMenusByCoach(coach);
        }
    }

    private CoachesMenuByday getCoachesMenuByDay(Coaches coaches, CategoryByDay categoryByDay) {
        List<CoachMenuByDay> coachesMenuByDay = new ArrayList<>();
        for (Coach coach : coaches.getCoaches()) {
            CoachMenuByDay coachMenuByDay = new CoachMenuByDay(categoryByDay, coach);
            coachesMenuByDay.add(coachMenuByDay);
        }
        return new CoachesMenuByday(coachesMenuByDay);
    }
}
