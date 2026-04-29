import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class StudyingApp extends Application
{

    private final URL FXMLDirectory = Objects.requireNonNull(getClass().getResource("presentation/fxml/main.fxml"));
  //  private final String CSSDirectory = Objects.requireNonNull(getClass().getResource("actual/main.css")).toExternalForm();

    public final void start(final Stage primary) throws IOException
    {
         final Parent root;
         final Scene scene;

         root = FXMLLoader.load(FXMLDirectory);

         scene = new Scene(root);
        // scene.getStylesheets().add(CSSDirectory);

         primary.setScene(scene);
         primary.show();
    }

    public static void main(final String[] args)
    {
        launch(args);
    }
}
