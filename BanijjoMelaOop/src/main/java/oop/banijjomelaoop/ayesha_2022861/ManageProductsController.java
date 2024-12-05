package oop.banijjomelaoop.ayesha_2022861;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.cert.Extension;
import java.time.LocalDate;
import java.util.ArrayList;

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
    private TableColumn<Product, Integer> quantityColoumnForManageProducts;
    @javafx.fxml.FXML
    private TableColumn<Product, String> productNameColoumnForManageProducts;
    @javafx.fxml.FXML
    private Tab manageProductTab;
    @javafx.fxml.FXML
    private TabPane stallownerTab;
    @javafx.fxml.FXML
    private TableColumn<Product, Integer> productIDColoumForManageProducts;
    @javafx.fxml.FXML
    private TableView<Product> productsTableView;
    @javafx.fxml.FXML
    private TableColumn<Product, Double> priceColoumnForManageProducts1;
    @javafx.fxml.FXML
    private AnchorPane imgAnchorPanBox;
    @javafx.fxml.FXML
    private TableColumn<Product, String> typeColoumnForManageProducts11;
    @javafx.fxml.FXML
    private ComboBox<String> productTypeComboBoxField;
    @javafx.fxml.FXML
    private ComboBox<String> productStatusComboBoxField;
    @javafx.fxml.FXML
    private TableColumn<Product, String> statusColoumnForManageProducts12;

    private Image img;

    private ObservableList<Product> productList = FXCollections.observableArrayList();

    private ArrayList<Image> images = new ArrayList<>();
    @javafx.fxml.FXML
    private ImageView imgViewContainer;


    @javafx.fxml.FXML
    public void initialize()
    {


        productNameColoumnForManageProducts.setCellValueFactory(new PropertyValueFactory<>("productName"));
        productIDColoumForManageProducts.setCellValueFactory(new PropertyValueFactory<>("productID"));
        quantityColoumnForManageProducts.setCellValueFactory(new PropertyValueFactory<>("productQuantity"));
        priceColoumnForManageProducts1.setCellValueFactory(new PropertyValueFactory<>("productPrice"));
        typeColoumnForManageProducts11.setCellValueFactory(new PropertyValueFactory<>("productType"));
        statusColoumnForManageProducts12.setCellValueFactory(new PropertyValueFactory<>("productStatus"));


        productsTableView.setItems(productList);

        productTypeComboBoxField.getItems().addAll("Food", "Clothing", " Cosmetics", "Stationary", "Footwear");
        productStatusComboBoxField.getItems().addAll("Available", "Unavailable","Up Coming");



    }


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
    public void promotionOnActionButton(ActionEvent actionEvent)
    {
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

    @Deprecated
    public void notifyCustomerBtnOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateButtonOnActionForManageProducts(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addBtnOnAction(ActionEvent actionEvent)
    {
       // String productName, String productType, int productID, int productQuantity, double productPrice, String productStatus

        Product newProduct = new Product(
                productNameTextField.getText(),
                productTypeComboBoxField.getValue(),
                Integer.parseInt(productIdTextField.getText()),
                Integer.parseInt(quanityTextFieldForManageProducts.getText()),
                Double.parseDouble(priceTextFieldForManageProduct.getText()),
                productStatusComboBoxField.getValue()


        );
        productList.add(newProduct);
        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Text.txt"));
            for(Product products: productList)
            {
                bw.write(products.getProductName() + "," + products.getProductID() + ","+ products.getProductQuantity()+","+products.getProductQuantity()+","+products.getProductPrice()+","+products.getProductType()+","+products.getProductStatus() + "\n");

            }
            bw.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }

    @javafx.fxml.FXML
    public void imgImportBtnOnAction(ActionEvent actionEvent)
    {
        FileChooser openFile = new FileChooser();
        openFile.getExtensionFilters().add(new FileChooser.ExtensionFilter("Open Image File", "*png", "*jpg","*JPEG"));
        File file = openFile.showOpenDialog(imgAnchorPanBox.getScene().getWindow());
        if(file != null)
        {

            img = new Image(file.toURI().toString(),106,122,false,true);

            imgViewContainer.setImage(img);
            images.add(img);
             


        }
    }
}
