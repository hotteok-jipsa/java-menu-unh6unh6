package menu;

import menu.controller.MenuController;
import menu.validator.InputValidator;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuApplication {
    public static void run() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        InputValidator inputValidator = new InputValidator();

        new MenuController(inputView, outputView, inputValidator).start();
    }
}
