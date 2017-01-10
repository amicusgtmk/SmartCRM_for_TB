package ru.gtmk.view;

import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by User on 08.01.2017.
 */
public class View {

    private Stage mPrimaryStage;
    private ScrollPane mScrollPane;
    private BorderPane mMainPane;
    private Scene mMainScene;
    private LeftMenue mLeftMenue;


    private TopMenueBar mTopMenueBar;

    public void drawPrimaryStage(Stage primaryStage){
        mPrimaryStage = primaryStage;
        mPrimaryStage.setTitle("SmartCRM for TB");

        mScrollPane = new ScrollPane();
        mMainPane = new BorderPane();

        mScrollPane.setContent(mMainPane);

        mMainScene = new Scene(mScrollPane, 600, 600);

        mPrimaryStage.setScene(mMainScene);

        mPrimaryStage.show();

    }

    public Stage getPrimaryStage(){
        return mPrimaryStage;
    }

    public void drawTopMenue(){
        mTopMenueBar = new TopMenueBar();
        mMainPane.setTop(mTopMenueBar);

    }

    public void drawLeftMenue(){
        mLeftMenue = new LeftMenue();
        mMainPane.setLeft(mLeftMenue);

    }

    public TopMenueBar getTopMenueBar() {
        return mTopMenueBar;
    }

    public LeftMenue getLeftMenue() {
        return mLeftMenue;
    }
}
