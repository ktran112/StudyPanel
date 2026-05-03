package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import utility.DynamicFontScaler;
import utility.TextScalable;

public class CalendarButtonsController implements TextScalable
{
    @FXML
    private GridPane calendarButtonsNode;

    @FXML
    private Button calendarButtonsAddEvent;

    @FXML
    private Button calendarButtonsCalendar;


    @Override
    public void scaleAll(final Region root)
    {
        DynamicFontScaler.applyBodyScaling(this.calendarButtonsAddEvent, root, false, true);
        DynamicFontScaler.applyBodyScaling  (this.calendarButtonsCalendar, root, false, true);
    }
}
