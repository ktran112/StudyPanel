package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import utility.DynamicFontScaler;
import utility.TextScalable;

public class SessionsController implements TextScalable
{
    @FXML
    private GridPane sessionNode;

    @FXML
    private Button sessionStart;

    @FXML
    private Button sessionViewPast;


    @Override
    public void scaleAll(final Region root)
    {
        DynamicFontScaler.applyBodyScaling(this.sessionStart, root, false, true);
        DynamicFontScaler.applyBodyScaling(this.sessionViewPast, root, false, true);
    }
}
