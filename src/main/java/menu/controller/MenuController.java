package menu.controller;

import java.util.ArrayList;
import java.util.List;
import menu.model.Coach;
import menu.model.Coaches;
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
        inputView.printCoachNameInputGuideMessage();
        Coaches coaches = getCoaches();
        getAndSetCantEatMenu(coaches);
    }

    private Coaches getCoaches() {
        String input = inputView.getInput();
        while (true) {
            try {
                List<String> rawCoachesName = inputValidator.validateCoachesName(input);
                return new Coaches(getRawCoaches(rawCoachesName));
            } catch (Exception e) {
                outputView.printErrorMessage(e);
            }
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
            inputView.printCantEatMenuInputGuideMessage(coach.getName());
            String input = inputView.getInput();
            List<String> cantEatMenus = inputValidator.validateCantEatMenus(input);

        }
    }
}
