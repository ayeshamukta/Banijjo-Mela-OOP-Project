package oop.banijjomelaoop;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class CustomerdashboardViewController
{


    @javafx.fxml.FXML
    public void initialize()
    {

    }


    @javafx.fxml.FXML
    public void toRieviewOnActionButton(ActionEvent actionEvent)
    {

    }

    @javafx.fxml.FXML
    public void customerLogOutOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("loginView.fxml"));
            Scene customerScene = new Scene(fxmlLoader.load());
            Stage customerStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            customerStage.setTitle("Trade Fair");
            customerStage.setScene(customerScene);
            customerStage.show();
        }
        catch (Exception e)
        {

        }
    }

    @javafx.fxml.FXML
    public void myOrdersOnActionButton(ActionEvent actionEvent)
    {

    }

    @javafx.fxml.FXML
    public void cartOnActionButton(ActionEvent actionEvent)
    {

    }

    @javafx.fxml.FXML
    public void askQuestionOnActionButton(ActionEvent actionEvent)
    {

    }

    @javafx.fxml.FXML
    public void wishlistOnActionButton(ActionEvent actionEvent)
    {

    }

    @javafx.fxml.FXML
    public void eventActivitiesOnActionButton(ActionEvent actionEvent)
    {

    }

    @javafx.fxml.FXML
    public void disscountsOnActionButton(ActionEvent actionEvent)
    {

    }

    @javafx.fxml.FXML
    public void shopOnActionButton(ActionEvent actionEvent)
    {

    }
}