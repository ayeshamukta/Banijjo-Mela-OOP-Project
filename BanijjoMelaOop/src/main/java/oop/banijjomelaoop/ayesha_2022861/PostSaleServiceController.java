package oop.banijjomelaoop.ayesha_2022861;

import javafx.event.ActionEvent;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import oop.banijjomelaoop.Utility;

public class PostSaleServiceController {
    @javafx.fxml.FXML
    private TableView postSaleTableView;
    @javafx.fxml.FXML
    private TableColumn approvalColoumnForPostSaleService;
    @javafx.fxml.FXML
    private TableColumn dateOfPurchaseColoumnForPostSaleService;
    @javafx.fxml.FXML
    private TableColumn productNameColoumnForPostSaleService;
    @javafx.fxml.FXML
    private TabPane stallownerTab;
    @javafx.fxml.FXML
    private Tab postSaleServiceTab;
    @javafx.fxml.FXML
    private TableColumn orderIDColoumnForPostSaleService;
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void salePerformanceOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            SalePerformanceController salePerformanceController = Utility.sceneSwitch(actionEvent, "salePerformanceView.fxml", "Sale Performance" );
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
            QandAController qa = Utility.sceneSwitch(actionEvent, "q&a.fxml", "Q & A" );


        }
        catch (Exception e)
        {

        }
    }

    @javafx.fxml.FXML
    public void promotionOnActionButton(ActionEvent actionEvent)  {


        try
        {

            PromotionController pc = Utility.sceneSwitch(actionEvent, "Promotion.fxml", "Promotion" );



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
            ManageProductsController manage_products = Utility.sceneSwitch(actionEvent, "manageProducts.fxml", "Manage Products" );
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
            FeedbackController feed_back = Utility.sceneSwitch(actionEvent, "feedback.fxml", "Feed Back" );

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
            LoginViewController logout = Utility.sceneSwitch(actionEvent, "loginView.fxml", "Trade Fair" );

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
            PostSaleServiceController post_sale_service = Utility.sceneSwitch(actionEvent, "postSaleService.fxml", "Post Sale Service" );
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
            ManageInventoryController manageInventoryController = Utility.sceneSwitch(actionEvent, "manageInventoryView.fxml", "Manage Inventory" );
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
            RegisterController registerController = Utility.sceneSwitch(actionEvent, "registerView.fxml", "Register" );
        }
        catch (Exception e)
        {

        }
    }

}
