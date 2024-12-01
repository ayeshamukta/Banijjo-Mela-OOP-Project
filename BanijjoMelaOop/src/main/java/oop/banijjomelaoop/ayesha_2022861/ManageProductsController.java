package oop.banijjomelaoop.ayesha_2022861;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import oop.banijjomelaoop.Utility;

public class ManageProductsController {
    @javafx.fxml.FXML
    private TextField quanityTextFieldForManageProducts;
    @javafx.fxml.FXML
    private TextField priceTextFieldForManageProduct;
    @javafx.fxml.FXML
    private TextField productIdTextField;
    @javafx.fxml.FXML
    private TextField productNameTextField;
    @javafx.fxml.FXML
    private TableColumn quantityColoumnForManageProducts;
    @javafx.fxml.FXML
    private TextField imgField;
    @javafx.fxml.FXML
    private TableColumn productNameColoumnForManageProducts;
    @javafx.fxml.FXML
    private Tab manageProductTab;
    @javafx.fxml.FXML
    private TabPane stallownerTab;
    @javafx.fxml.FXML
    private Button updateButtonOnActionForManageProducts;
    @javafx.fxml.FXML
    private TableColumn productIDColoumForManageProducts;
    @javafx.fxml.FXML
    private TextField descriptionTextFieldForManageProducts;

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
    public void promotionOnActionButton(ActionEvent actionEvent)
    {
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
