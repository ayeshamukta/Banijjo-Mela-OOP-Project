package oop.banijjomelaoop;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class StallOwnerDashBoardViewController
{
    @javafx.fxml.FXML
    private Tab manageInventoryTab;
    @javafx.fxml.FXML
    private Tab feedBackTab;
    @javafx.fxml.FXML
    private ComboBox slotsComboBox;
    @javafx.fxml.FXML
    private Tab qAndaTab;
    @javafx.fxml.FXML
    private TableColumn durationColoumn;
    @javafx.fxml.FXML
    private Label errorLabelField;
    @javafx.fxml.FXML
    private Tab registerTab;
    @javafx.fxml.FXML
    private Tab postSaleServiceTab;
    @javafx.fxml.FXML
    private TableColumn ownerNameColoumn;
    @javafx.fxml.FXML
    private TextField ownerNameTextField;
    @javafx.fxml.FXML
    private Tab salePerformanceTab;
    @javafx.fxml.FXML
    private Tab promotionTab;
    @javafx.fxml.FXML
    private ComboBox stallRowComboBox;
    @javafx.fxml.FXML
    private ComboBox stallNumComboBox;
    @javafx.fxml.FXML
    private Tab manageProductTab;
    @javafx.fxml.FXML
    private TableColumn stallNumColoumn;
    @javafx.fxml.FXML
    private TableColumn stallRowColoumn;
    @javafx.fxml.FXML
    private TabPane stallownerTab;

    @javafx.fxml.FXML
    public void initialize()
    {
        stallownerTab.addEventFilter(MouseEvent.MOUSE_PRESSED, event -> event.consume());

    }

    @javafx.fxml.FXML
    public void salePerformanceOnActionButton(ActionEvent actionEvent)
    {
        stallownerTab.getSelectionModel().select(salePerformanceTab);
    }

    @javafx.fxml.FXML
    public void checkAvailibilityOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void regiterOnActionMainButton(ActionEvent actionEvent)
    {
        stallownerTab.getSelectionModel().select(registerTab);
    }

    @javafx.fxml.FXML
    public void qAndaOnActionButton(ActionEvent actionEvent)
    {
        stallownerTab.getSelectionModel().select(qAndaTab);
    }

    @javafx.fxml.FXML
    public void registerOnAction(ActionEvent actionEvent)
    {

    }

    @javafx.fxml.FXML
    public void logOutButtonOnAction(ActionEvent actionEvent)
    {

    }

    @javafx.fxml.FXML
    public void promotionOnActionButton(ActionEvent actionEvent)
    {
        stallownerTab.getSelectionModel().select(promotionTab);
    }



    @javafx.fxml.FXML
    public void feedbackOnActionButton(ActionEvent actionEvent)
    {
        stallownerTab.getSelectionModel().select(feedBackTab);
    }

    @javafx.fxml.FXML
    public void postSaleServiceOnActionButton(ActionEvent actionEvent)
    {
        stallownerTab.getSelectionModel().select(postSaleServiceTab);
    }

    @javafx.fxml.FXML
    public void manageInventoryOnActionButton(ActionEvent actionEvent)
    {
        stallownerTab.getSelectionModel().select(manageInventoryTab);
    }


    @javafx.fxml.FXML
    public void manageProductOnActionButton(ActionEvent actionEvent)
    {
        stallownerTab.getSelectionModel().select(manageProductTab);
    }
}