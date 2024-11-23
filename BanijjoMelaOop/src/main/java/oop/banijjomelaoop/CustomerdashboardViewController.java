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
    private Tab productTab;
    @javafx.fxml.FXML
    private Tab myOrdersTab;
    @javafx.fxml.FXML
    private Tab disscountTab;
    @javafx.fxml.FXML
    private TabPane customerTabpane;
    @javafx.fxml.FXML
    private Tab cartTab;
    @javafx.fxml.FXML
    private Tab askQuestionTab;
    @javafx.fxml.FXML
    private Tab wishlistTab;
    @javafx.fxml.FXML
    private Tab reviewTab;
    @javafx.fxml.FXML
    private Tab eventActivitiesTab;

    @javafx.fxml.FXML
    public void initialize()
    {
        customerTabpane.addEventFilter(MouseEvent.MOUSE_PRESSED, event -> event.consume());
    }


    @javafx.fxml.FXML
    public void toRieviewOnActionButton(ActionEvent actionEvent)
    {
        customerTabpane.getSelectionModel().select(reviewTab);
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
        customerTabpane.getSelectionModel().select(myOrdersTab);
    }

    @javafx.fxml.FXML
    public void cartOnActionButton(ActionEvent actionEvent)
    {
        customerTabpane.getSelectionModel().select(cartTab);
    }

    @javafx.fxml.FXML
    public void askQuestionOnActionButton(ActionEvent actionEvent)
    {
        customerTabpane.getSelectionModel().select(askQuestionTab);
    }

    @javafx.fxml.FXML
    public void wishlistOnActionButton(ActionEvent actionEvent)
    {
        customerTabpane.getSelectionModel().select(wishlistTab);
    }

    @javafx.fxml.FXML
    public void eventActivitiesOnActionButton(ActionEvent actionEvent)
    {
        customerTabpane.getSelectionModel().select(eventActivitiesTab);
    }

    @javafx.fxml.FXML
    public void disscountsOnActionButton(ActionEvent actionEvent)
    {
        customerTabpane.getSelectionModel().select(disscountTab);
    }

    @javafx.fxml.FXML
    public void shopOnActionButton(ActionEvent actionEvent)
    {
        customerTabpane.getSelectionModel().select(productTab);
    }
}