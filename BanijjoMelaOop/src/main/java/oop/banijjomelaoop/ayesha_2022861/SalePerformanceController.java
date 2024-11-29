package oop.banijjomelaoop.ayesha_2022861;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import oop.banijjomelaoop.Utility;

public class SalePerformanceController {
    @javafx.fxml.FXML
    private TableColumn hyyy;
    @javafx.fxml.FXML
    private ComboBox ttt;

    @javafx.fxml.FXML
    public void stallOwnerLogOutButtonOnAction(ActionEvent actionEvent)
    {
        try
        {
            LoginViewController logout = Utility.sceneSwitch(actionEvent, "loginView.fxml", "Trade Fair" );

        }
        catch (Exception e)
        {

        }
    }
}

