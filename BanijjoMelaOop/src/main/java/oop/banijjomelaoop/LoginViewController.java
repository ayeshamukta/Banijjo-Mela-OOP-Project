package oop.banijjomelaoop;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    public void loginButtonOnAction(ActionEvent actionEvent) {
    }
}