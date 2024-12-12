package menu.controller;

import menu.view.InputView;

public class MenuController {

    private final InputView inputView;

    public MenuController(InputView inputView) {
        this.inputView = inputView;
    }

    public void start() {
        inputView.printStartGuideMessage();
    }
}
