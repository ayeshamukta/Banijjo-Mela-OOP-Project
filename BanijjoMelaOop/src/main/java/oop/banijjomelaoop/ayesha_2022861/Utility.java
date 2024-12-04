package oop.banijjomelaoop.ayesha_2022861;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oop.banijjomelaoop.MainApplication;

import java.io.IOException;

public class Utility
{
    public static <E> E sceneSwitch(ActionEvent event, String fxmlFile , String stageName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource(fxmlFile));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle(stageName);


        E controller = fxmlLoader.getController();
        return controller;
    }
}
