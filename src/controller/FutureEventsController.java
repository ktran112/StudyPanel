package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import utility.DynamicFontScaler;
import utility.TextScalable;

public class FutureEventsController implements TextScalable
{
    @FXML
    private GridPane futureEventsNode;

    @FXML
    private Label futureEventsTopDate;

    @FXML
    private Label futureEventsBottomDate;

    @FXML
    private Label futureEventsTopDesc;

    @FXML
    private Label futureEventsBottomDesc;

    @FXML
    private Separator futureEventsSeparator;


    @Override
    public void scaleAll(final Region root)
    {
        DynamicFontScaler.applyHeaderScaling(this.futureEventsTopDate, root, false, true);
        DynamicFontScaler.applyHeaderScaling(this.futureEventsBottomDate, root, false, true);
        DynamicFontScaler.applyCaptionScaling(this.futureEventsTopDesc, root, false, true);
        DynamicFontScaler.applyCaptionScaling(this.futureEventsBottomDesc, root, false, true);
    }
}