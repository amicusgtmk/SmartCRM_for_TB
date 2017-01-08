import javafx.application.Application;
import javafx.stage.Stage;
import ru.gtmk.control.Controller;

/**
 * Created by User on 06.01.2017.
 */
public class SmartCRM extends Application {
    public static void main(String[] args) {
        launch(args);
        // TODO swith on SQL base for translators
        // TODO add translators
        // TODO search base
        // TODO for list of mistakes and their values

    }

    public void start(Stage primaryStage) throws Exception {
        Controller controller = new Controller();
        controller.start(primaryStage);

    }
}
