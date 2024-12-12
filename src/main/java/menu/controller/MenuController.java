package menu.controller;

import java.util.ArrayList;
import java.util.List;
import menu.model.Coach;
import menu.model.Coaches;
import menu.validator.InputValidator;
import menu.view.InputView;

public class MenuController {

    private final InputView inputView;
    private final InputValidator inputValidator;

    public MenuController(InputView inputView, InputValidator inputValidator) {
        this.inputView = inputView;
        this.inputValidator = inputValidator;
    }

    public void start() {
        inputView.printStartGuideMessage();
        inputView.printCoachNameInputGuideMessage();
        Coaches coaches = getCoaches();
    }

    private Coaches getCoaches() {
        String input = inputView.getInput();
        List<String> rawCoachesName = inputValidator.validateCoachesName(input);
        List<Coach> coaches = new ArrayList<>();
        for (String cacheName : rawCoachesName) {
            coaches.add(new Coach(cacheName));
        }
        return new Coaches(coaches);
    }
}
