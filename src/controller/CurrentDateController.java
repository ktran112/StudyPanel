package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import utility.DynamicFontScaler;
import utility.TextScalable;

public class CurrentDateController implements TextScalable
{
    private static final int CURRENT_DATE_DESC_DIVISOR = 55;

    @FXML
    private Label currentDateWeekday;

    @FXML
    private Label currentDateLabel;

    @FXML
    private Label currentDateDesc;


    @Override
    public void scaleAll(final Region root)
    {
        DynamicFontScaler.applySubheadScaling(this.currentDateWeekday, root, false);
        DynamicFontScaler.applyHeroScaling(this.currentDateLabel, root, false);
        DynamicFontScaler.applyScalableText(this.currentDateDesc, root, CURRENT_DATE_DESC_DIVISOR);
    }
}
