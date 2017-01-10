package ru.gtmk.view;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;

/**
 * Created by User on 10.01.2017.
 */
public class LeftMenue extends StackPane {
    private TreeView<String> mTreeView;

    public LeftMenue(){
        TreeItem<String> rootItem = new TreeItem<String>("Модули");

        rootItem.setExpanded(true);

        TreeItem<String> clientsItem = new TreeItem<String>("Клиенты");
        TreeItem<String> translatorsItem = new TreeItem<String>("Переводчики");
        TreeItem<String> projectsItem = new TreeItem<String>("Проекты");

        rootItem.getChildren().addAll(clientsItem, translatorsItem, projectsItem);

        mTreeView = new TreeView<>(rootItem);
        this.getChildren().add(mTreeView);

    }

    public TreeView<String> getTreeView() {
        return mTreeView;
    }
}
