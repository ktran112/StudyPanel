package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import utility.DynamicFontScaler;
import utility.TextScalable;

public class NextEventController implements TextScalable
{
    private static final int NEXT_EVENT_LABEL_DIVISOR = 15;
    private static final int NEXT_EVENT_DESC_DIVISOR = 17;
    private static final double NEXT_EVENT_DESC_LINE_HEIGHT_MULTIPLIER = 3.5;

    @FXML
    private GridPane nextEventNode;

    @FXML
    private Label nextEventLabel;

    @FXML
    private Label nextEventDate;


    @FXML
    private Label nextEventDesc;


    @FXML
    private void initialize()
    {
        DynamicFontScaler.bindMaxHeightToFontSize(this.nextEventDesc, NEXT_EVENT_DESC_LINE_HEIGHT_MULTIPLIER);
    }

    @Override
    public void scaleAll(final Region root)
    {
        DynamicFontScaler.applyBodyScaling(this.nextEventLabel, root, false, true);
        DynamicFontScaler.applyHeroScaling(this.nextEventDate, root, false, true);
        DynamicFontScaler.applyCaptionScaling(this.nextEventDesc, root, false, true);
    }
}
