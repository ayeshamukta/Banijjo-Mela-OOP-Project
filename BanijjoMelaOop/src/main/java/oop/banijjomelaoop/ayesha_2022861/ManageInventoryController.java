package oop.banijjomelaoop.ayesha_2022861;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ManageInventoryController {
    @javafx.fxml.FXML
    private ComboBox ediableComboBoxForManageInventory;
    @javafx.fxml.FXML
    private Tab manageInventoryTab;
    @javafx.fxml.FXML
    private ComboBox productIdComboBoxForManageInventory;
    @javafx.fxml.FXML
    private TableColumn quantityColForManageInventory;
    @javafx.fxml.FXML
    private TextField enterValueTextFieldForManageInventory;
    @javafx.fxml.FXML
    private TableColumn productNameColForManageInventory;
    @javafx.fxml.FXML
    private TableColumn proIdColForManageInventory;
    @javafx.fxml.FXML
    private TableView inventoryTableView;
    @javafx.fxml.FXML
    private TabPane stallownerTab;

    @javafx.fxml.FXML
    public void salePerformanceOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            SalePerformanceController salePerformanceController = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/salePerformanceView.fxml", "Sale Performance" );
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
            QandAController qa = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/q&a.fxml", "Q & A" );


        }
        catch (Exception e)
        {

        }
    }

    @javafx.fxml.FXML
    public void promotionOnActionButton(ActionEvent actionEvent)  {


        try
        {

            PromotionController pc = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/Promotion.fxml", "Promotion" );



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
            ManageProductsController manage_products = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/manageProducts.fxml", "Manage Products" );
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
            FeedbackController feed_back = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/feedback.fxml", "Feed Back" );

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
            LoginViewController logout = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/loginView.fxml", "Trade Fair" );

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
            PostSaleServiceController post_sale_service = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/postSaleService.fxml", "Post Sale Service" );
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
            ManageInventoryController manageInventoryController = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/manageInventoryView.fxml", "Manage Inventory" );
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
            RegisterController registerController = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/registerView.fxml", "Register" );
        }
        catch (Exception e)
        {

        }
    }



    @javafx.fxml.FXML
    public void updateBtnOnActionlForManageInventory(ActionEvent actionEvent) {
    }
}
