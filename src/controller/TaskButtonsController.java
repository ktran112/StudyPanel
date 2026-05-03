package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import utility.DynamicFontScaler;
import utility.TextScalable;

public class TaskButtonsController implements TextScalable
{
    @FXML
    private Button taskButtonsAdd;

    @FXML
    private Button taskButtonsEdit;

    @FXML
    private Button taskButtonsFilter;

    @FXML
    private Button taskButtonsSettings;


    @Override
    public void scaleAll(final Region root)
    {
        DynamicFontScaler.applyCaptionScaling(this.taskButtonsAdd, root, false, true);
        DynamicFontScaler.applyCaptionScaling(this.taskButtonsEdit, root, false, true);
        DynamicFontScaler.applyCaptionScaling(this.taskButtonsFilter, root, false, true);
        DynamicFontScaler.applyCaptionScaling(this.taskButtonsSettings, root, false, true);
    }
}
