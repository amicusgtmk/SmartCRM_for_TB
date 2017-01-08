package ru.gtmk.view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

/**
 * Created by User on 08.01.2017.
 */
public class TopMenueBar extends MenuBar {


    private MenuItem exitItem;

    public TopMenueBar(){

        Menu fileMenue = new Menu("File");
        Menu editMenue = new Menu("Edit");

        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        exitItem = new MenuItem("Exit");

        fileMenue.getItems().addAll(newItem, openItem, exitItem);

        this.getMenus().addAll(fileMenue, editMenue);


    }

    public MenuItem getExitItem() {
        return exitItem;
    }

}
