package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import utility.DynamicFontScaler;
import utility.TextScalable;

public class QuoteOfDayController implements TextScalable
{
    @FXML
    private Label quoteOfDayLabel;


    @Override
    public void scaleAll(final Region root)
    {
        DynamicFontScaler.applyBigBodyScaling(this.quoteOfDayLabel, root, false, true);
    }
}
