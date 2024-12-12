package menu.controller;

import menu.model.Coaches;
import menu.view.InputView;

public class MenuController {

    private final InputView inputView;

    public MenuController(InputView inputView) {
        this.inputView = inputView;
    }

    public void start() {
        inputView.printStartGuideMessage();
        inputView.printCoachNameInputGuideMessage();
        Coaches coaches = getCoaches();
    }

    private Coaches getCoaches() {
        String coachesName = inputView.getInput();
        return new Coaches(null);
    }
}
