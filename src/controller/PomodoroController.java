package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import utility.DynamicFontScaler;
import utility.TextScalable;

public class PomodoroController implements TextScalable
{
    private static final int POMODORO_BIG_BUTTON_DIVISOR = 70;
    private static final int POMODORO_BIG_BUTTON_MIN = 9;

    @FXML
    private GridPane pomodoroNode;

    @FXML
    private Label pomodoroPomodoro;

    @FXML
    private Label pomodoroTimer;

    @FXML
    private Button pomodoroMinusBig;

    @FXML
    private Button pomodoroMinusSmall;

    @FXML
    private Button pomodoroAddSmall;

    @FXML
    private Button pomodoroAddBig;

    @FXML
    private Button pomodoroHideTimer;

    @FXML
    private Button pomodoroStop;


    @Override
    public void scaleAll(final Region root)
    {
        DynamicFontScaler.applyBigBodyScaling(this.pomodoroPomodoro, root, false, true);
        DynamicFontScaler.applyBigTitleScaling(this.pomodoroTimer, root, false, true);
        DynamicFontScaler.applyScalableText(this.pomodoroMinusBig, root, POMODORO_BIG_BUTTON_DIVISOR, POMODORO_BIG_BUTTON_MIN);
        DynamicFontScaler.applyCaptionScaling(this.pomodoroMinusSmall, root, false, true);
        DynamicFontScaler.applyCaptionScaling(this.pomodoroAddSmall, root, false, true);
        DynamicFontScaler.applyScalableText(this.pomodoroAddBig, root, POMODORO_BIG_BUTTON_DIVISOR, POMODORO_BIG_BUTTON_MIN);
        DynamicFontScaler.applyCaptionScaling(this.pomodoroHideTimer, root, false, true);
        DynamicFontScaler.applyCaptionScaling(this.pomodoroStop, root, false, true);
    }
}