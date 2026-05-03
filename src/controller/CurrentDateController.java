package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import utility.DynamicFontScaler;
import utility.TextScalable;

public class CurrentDateController implements TextScalable
{
    private static final int CURRENT_DATE_DESC_DIVISOR = 10;

    @FXML
    private VBox currentDateNode;

    @FXML
    private Label currentDateWeekday;

    @FXML
    private Label currentDateLabel;

    @FXML
    private TextFlow currentDateTextFlow;

    @FXML
    private Text currentDateDesc;

    @FXML
    private void initialize()
    {
            DynamicFontScaler.bindParentToRegionWidth(this.currentDateTextFlow, this.currentDateNode);
    }

    @Override
    public void scaleAll(final Region root)
    {
        DynamicFontScaler.applySubheadScaling(this.currentDateWeekday, root, false, true);
        DynamicFontScaler.applyTitleScaling(this.currentDateLabel, root, false, true);
        DynamicFontScaler.applyScalableText(this.currentDateDesc, root, 50);
    }


}
