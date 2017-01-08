package ru.gtmk.control;

import javafx.stage.Stage;
import ru.gtmk.model.Model;
import ru.gtmk.view.View;

/**
 * Created by User on 08.01.2017.
 */
public class Controller {
    private Model mModel;
    private View mView;

    public Controller() {
        this(new Model(), new View());
    }

    public Controller(Model model, View view) {
        mModel = model;
        mView = view;
    }

    public void start(Stage primaryStage){
        mView.drawPrimaryStage(primaryStage);

    }


}
