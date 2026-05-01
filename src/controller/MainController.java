package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;

public class MainController
{
    @FXML
    private TabPane tabPaneRoot;

    @FXML
    private CurrentDateController currentDateCardController;

    @FXML
    private void initialize()
    {
        this.currentDateCardController.scaleAll(this.tabPaneRoot);
    }
}
