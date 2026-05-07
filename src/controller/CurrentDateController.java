package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import utility.DynamicFontScaler;
import utility.TextScalable;

public class CurrentDateController implements TextScalable
{
    private static final int CURRENT_DATE_DESC_DIVISOR = 60;
    private static final int CURRENT_DATE_DESC_MIN = 10;

    private static final double CURRENT_DATE_DESC_LINE_HEIGHT_MULTIPLIER = 3.5;

    @FXML
    private VBox currentDateNode;

    @FXML
    private Label currentDateWeekday;

    @FXML
    private Label currentDateLabel;

    @FXML
    private Label currentDateDesc;

    @FXML
    private void initialize()
    {
        DynamicFontScaler.bindMaxHeightToFontSize(this.currentDateDesc, CURRENT_DATE_DESC_LINE_HEIGHT_MULTIPLIER);
    }

    @Override
    public void scaleAll(final Region root)
    {
        DynamicFontScaler.applySubheadScaling(this.currentDateWeekday, root, false, true);
        DynamicFontScaler.applyTitleScaling(this.currentDateLabel, root, false, true);
        DynamicFontScaler.applyScalableText(this.currentDateDesc, root, CURRENT_DATE_DESC_DIVISOR, CURRENT_DATE_DESC_MIN);
    }


}
