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

        // Adding TopMenue
        mView.drawTopMenue();
        setTopMenueControl();

        // Adding left menue
        mView.drawLeftMenue();
        setLeftMenueControl();

        mView.getPrimaryStage().setOnCloseRequest(e -> {
            e.consume();
            exitFromProgram();
        });
    }

    public void exitFromProgram(){
        System.out.println("Closing program!");
        //Some code here
        mView.getPrimaryStage().close();
    }

    private void setTopMenueControl(){
        mView.getTopMenueBar().getExitItem().setOnAction(e -> exitFromProgram());
    }

    private void setLeftMenueControl(){
        mView.getLeftMenue().getTreeView().getSelectionModel().selectedIndexProperty().addListener(
                (observable, oldValue, newValue )->{


                    System.out.println(mView.getLeftMenue().getTreeView().getTreeItem(newValue.intValue()).getValue());


                }
        );
    }


}
