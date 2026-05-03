package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import utility.DynamicFontScaler;
import utility.TextScalable;

public class NextEventController implements TextScalable
{
    private static final int NEXT_EVENT_LABEL_DIVISOR = 15;
    private static final int NEXT_EVENT_DESC_DIVISOR = 17;

    @FXML
    private GridPane nextEventNode;

    @FXML
    private Label nextEventLabel;

    @FXML
    private Label nextEventDate;

    @FXML
    private TextFlow nextEventTextFlow;

    @FXML
    private Text nextEventDesc;


    @FXML
    private void initialize()
    {
        DynamicFontScaler.bindParentToRegionWidth(this.nextEventTextFlow, this.nextEventNode);
    }

    @Override
    public void scaleAll(final Region root)
    {
        DynamicFontScaler.applyBodyScaling(this.nextEventLabel, root, false, true);
        DynamicFontScaler.applyHeroScaling(this.nextEventDate, root, false, true);
        DynamicFontScaler.applyCaptionScaling(this.nextEventDesc, root, false, true);
    }
}
