package oop.banijjomelaoop.ayesha_2022861;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import oop.banijjomelaoop.Utility;

public class RegisterController {
    @javafx.fxml.FXML
    private ComboBox<Integer> stallNumComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> slotsComboBox;
    @javafx.fxml.FXML
    private Label registerErrorLabelField;
    @javafx.fxml.FXML
    private Label registerTabErrorMessage;
    @javafx.fxml.FXML
    private TableColumn<Stall, String> durationColoumn;
    @javafx.fxml.FXML
    private Tab registerTab;
    @javafx.fxml.FXML
    private TableColumn<Stall, Integer> stallNumColoumn;
    @javafx.fxml.FXML
    private TabPane stallownerTab;
    @javafx.fxml.FXML
    private TableColumn <Stall, String>ownerNameColoumn;
    @javafx.fxml.FXML
    private TextField ownerNameTextField;
    @javafx.fxml.FXML
    private TableColumn<Stall, Integer> stallRowColoumn;
    @javafx.fxml.FXML
    private ComboBox<Integer> stallRowComboBox;
    @javafx.fxml.FXML
    private TableView <Stall> registerStallTable;
    @javafx.fxml.FXML
    private TableColumn<Stall ,String> businessCatagoryTableColoumn;
    @javafx.fxml.FXML
    private ComboBox<String> businessCategoryComboBoxFields;

    private ObservableList<Stall> registerdShop = FXCollections.observableArrayList();

    public void setRegisterdShop(ObservableList<Stall> registerdShop) {
        this.registerdShop = registerdShop;

    }

    @javafx.fxml.FXML
    public void initialize()
    {
        slotsComboBox.getItems().addAll("1/12/24 - 15/12/24, 10:00 am - 2:59 pm", "1/12/24 - 15/12/24, 3:00 pm - 9:00 pm","16/12/24 - 31/12/24, 10:00 am - 3:00 pm", "16/12/24 - 31/12/24, 2:59 am - 9:00 pm");
        stallRowComboBox.getItems().addAll(1, 2, 3, 4, 5, 6,7, 8, 9, 10);
        stallNumComboBox.getItems().addAll(101,102,103,104,105,106,107,108,109,110,201,202,203,204,205,206,207,208,209, 210);
        businessCategoryComboBoxFields.getItems().addAll("Food", "Clothing", " Cosmetics", "Stationary", "Footwear");


//        Table Column Initialization

//         private int stallNum,stallRow;
//    private String ownerName, businessCategory, slots;

        stallNumColoumn.setCellValueFactory(new PropertyValueFactory<>("stallNum"));
        stallRowColoumn.setCellValueFactory(new  PropertyValueFactory<>("stallRow"));
        ownerNameColoumn.setCellValueFactory(new PropertyValueFactory<>("ownerName"));
        durationColoumn.setCellValueFactory(new PropertyValueFactory<>("slots"));
        businessCatagoryTableColoumn.setCellValueFactory(new PropertyValueFactory<>("businessCategory"));
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

    public Boolean registerConfirmation()
    {
        Boolean approvalAdmin = true;
        return approvalAdmin;

    }


    @javafx.fxml.FXML
    public void registerOnActionForStall(ActionEvent actionEvent )
    {
        boolean registerApproval = registerConfirmation();
        if((slotsComboBox.getValue() == null) || (stallNumComboBox.getValue() == null) || (stallRowComboBox.getValue() == null)|| (businessCategoryComboBoxFields.getValue()==null)|| (ownerNameTextField.getText().trim().isEmpty()) || (ownerNameTextField.getText().matches("a-xA-Z")))
        {
            registerTabErrorMessage.setText("Please Enter Valid Input");
            return;
        } else if (registerApproval)
        {
            registerTabErrorMessage.setText("Your Registration is Successful");
            Stall newStall = new Stall(

                    stallNumComboBox.getValue(),
                    stallRowComboBox.getValue(),
                    ownerNameTextField.getText(),
                    slotsComboBox.getValue(),
                    businessCategoryComboBoxFields.getValue()

            );
            registerdShop.add(newStall);
            registerStallTable.setItems(registerdShop);


        }
        else
        {
            registerTabErrorMessage.setText("Unsuccessful. Please Try Again");
        }
    }
}
