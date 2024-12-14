package oop.banijjomelaoop.ayesha_2022861;

import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oop.banijjomelaoop.MainApplication;

public class LoginViewController
{
    @javafx.fxml.FXML
    protected TextField userNameTextField;
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private Label errorLabelingField;
    @javafx.fxml.FXML
    protected ComboBox<String> groupComboBoxField;

    @javafx.fxml.FXML
    public void initialize()
    {
        groupComboBoxField.getItems().addAll("Admin", "Event Organizer", "Stall Owner", "Customer", "Delivery Personnel", "Security officer", "Sponsor", "Vendor Support Staff");
    }

    @javafx.fxml.FXML
    public void loginButtonOnAction(ActionEvent actionEvent)
    {
        String group = groupComboBoxField.getValue();
        String userName = userNameTextField.getText();
        Integer pass = Integer.parseInt(passwordTextField.getText());

    if(groupComboBoxField.getValue().isEmpty() ||
            userNameTextField.getText().isEmpty()||
            passwordTextField.getText() == null||
            (!userName.matches("[a-zA-Z]*")) )

    {
        errorLabelingField.setText("Please enter valid Input");
    }
    else
    {
        if(group.equals("Customer") && userName.equals("ayesha") && pass.equals(1234))
        {
            try
            {
                FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("/oop/banijjomelaoop/ayesha_2022861/CustomerdashboardView.fxml"));
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
        else if (group.equals("Stall Owner") && userName.equals("ayesha") && pass.equals(1234))
        {
            try
            {
                FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("/oop/banijjomelaoop/ayesha_2022861/stallOwnerDashBoardView.fxml"));
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
        else
        {
            errorLabelingField.setText("Not a valid User");
        }

    }

    }
//
}