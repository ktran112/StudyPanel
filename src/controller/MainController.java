package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;

public class MainController
{
    @FXML
    private TabPane tabPaneRoot;

    @FXML
    private CurrentDateController currentDateController;
    @FXML
    private VBox currentDateNode;

    @FXML
    private NextEventController nextEventController;

    @FXML
    private TaskButtonsController taskButtonsController;

    @FXML
    private CalendarButtonsController calendarButtonsController;

    @FXML
    private FutureEventsController futureEventsController;

    @FXML
    private PomodoroController pomodoroController;

    @FXML
    private final void initialize()
    {
        this.currentDateController.scaleAll(this.tabPaneRoot);
        this.nextEventController.scaleAll(this.tabPaneRoot);
        this.taskButtonsController.scaleAll(this.tabPaneRoot);
        this.calendarButtonsController.scaleAll(this.tabPaneRoot);
        this.futureEventsController.scaleAll(this.tabPaneRoot);
        this.pomodoroController.scaleAll(this.tabPaneRoot);
    }
}
