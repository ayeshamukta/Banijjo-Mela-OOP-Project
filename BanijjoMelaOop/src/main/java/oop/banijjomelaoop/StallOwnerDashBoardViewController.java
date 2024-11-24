package oop.banijjomelaoop;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StallOwnerDashBoardViewController
{




    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void salePerformanceOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("manageInventoryView.fxml"));
            Scene customerScene = new Scene(fxmlLoader.load());
            Stage customerStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            customerStage.setTitle("Register");
            customerStage.setScene(customerScene);
            customerStage.show();
        }
        catch (Exception e)
        {

        }
    }

    @javafx.fxml.FXML
    public void qAndaOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("manageInventoryView.fxml"));
            Scene customerScene = new Scene(fxmlLoader.load());
            Stage customerStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            customerStage.setTitle("Register");
            customerStage.setScene(customerScene);
            customerStage.show();
        }
        catch (Exception e)
        {

        }
    }

    @javafx.fxml.FXML
    public void promotionOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("manageInventoryView.fxml"));
            Scene customerScene = new Scene(fxmlLoader.load());
            Stage customerStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            customerStage.setTitle("Register");
            customerStage.setScene(customerScene);
            customerStage.show();
        }
        catch (Exception e)
        {

        }
    }

    @javafx.fxml.FXML
    public void manageProductOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("manageInventoryView.fxml"));
            Scene customerScene = new Scene(fxmlLoader.load());
            Stage customerStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            customerStage.setTitle("Register");
            customerStage.setScene(customerScene);
            customerStage.show();
        }
        catch (Exception e)
        {

        }
    }

    @javafx.fxml.FXML
    public void feedbackOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("manageInventoryView.fxml"));
            Scene customerScene = new Scene(fxmlLoader.load());
            Stage customerStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            customerStage.setTitle("Register");
            customerStage.setScene(customerScene);
            customerStage.show();
        }
        catch (Exception e)
        {

        }
    }

    @javafx.fxml.FXML
    public void stallOwnerLogOutButtonOnAction(ActionEvent actionEvent)
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
    public void postSaleServiceOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("manageInventoryView.fxml"));
            Scene customerScene = new Scene(fxmlLoader.load());
            Stage customerStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            customerStage.setTitle("Register");
            customerStage.setScene(customerScene);
            customerStage.show();
        }
        catch (Exception e)
        {

        }
    }

    @javafx.fxml.FXML
    public void manageInventoryOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("manageInventoryView.fxml"));
            Scene customerScene = new Scene(fxmlLoader.load());
            Stage customerStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            customerStage.setTitle("Register");
            customerStage.setScene(customerScene);
            customerStage.show();
        }
        catch (Exception e)
        {

        }
    }

    @javafx.fxml.FXML
    public void registerOnActionMainButton(ActionEvent actionEvent)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("registerView.fxml"));
            Scene customerScene = new Scene(fxmlLoader.load());
            Stage customerStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            customerStage.setTitle("Register");
            customerStage.setScene(customerScene);
            customerStage.show();
        }
        catch (Exception e)
        {

        }
    }

    @Deprecated
    public void showOnActionForSalePerformane(ActionEvent actionEvent) {
    }

    @Deprecated
    public void regiterOnActionMainButton(ActionEvent actionEvent) {
    }
}