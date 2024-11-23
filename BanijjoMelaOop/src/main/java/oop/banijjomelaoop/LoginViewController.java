package oop.banijjomelaoop;

import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginViewController
{
    @javafx.fxml.FXML
    private TextField userNameTextField;
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private Label errorLabelingField;
    @javafx.fxml.FXML
    private ComboBox<String> groupComboBoxField;

    @javafx.fxml.FXML
    public void initialize()
    {
        groupComboBoxField.getItems().addAll("Admin", "Event Organizer", "Stall Owner", "Customer", "Delivery Personnel", "Security officer", "Sponsor", "Vendor Support Staff");
    }

    @javafx.fxml.FXML
    public void loginButtonOnAction(ActionEvent actionEvent)
    {
        String group = groupComboBoxField.getValue();

        if(group.equals("Customer"))
        {
            try
            {
                FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("CustomerdashboardView.fxml"));
                Scene customerScene = new Scene(fxmlLoader.load());
                Stage customerStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                customerStage.setTitle("Customer Dashboard");
                customerStage.setScene(customerScene);
                customerStage.show();
            }
            catch (Exception e)
            {

            }

        }
        else if (group.equals("Stall Owner"))
        {
            try
            {
                FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("stallOwnerDashBoardView.fxml"));
                Scene customerScene = new Scene(fxmlLoader.load());
                Stage customerStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
                customerStage.setTitle("Stall Owner Dashboard");
                customerStage.setScene(customerScene);
                customerStage.show();
            }
            catch (Exception e)
            {

            }



        }


    }

}