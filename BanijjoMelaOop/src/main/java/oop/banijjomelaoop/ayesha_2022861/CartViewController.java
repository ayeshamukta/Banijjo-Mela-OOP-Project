package oop.banijjomelaoop.ayesha_2022861;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class CartViewController
{
    @javafx.fxml.FXML
    private Label errorAlertLabelText;
    @javafx.fxml.FXML
    private ComboBox<String> cusDivisionComboBox;
    @javafx.fxml.FXML
    private TextField cusAddressTextField;
    @javafx.fxml.FXML
    private TableColumn<CartItem, Integer> quanTableCol;
    @javafx.fxml.FXML
    private static TableView<CartItem> tableviewCart;
    @javafx.fxml.FXML
    private TableColumn<CartItem, Double> priceTableCol;
    @javafx.fxml.FXML
    private TextField customerNameTextField;
    @javafx.fxml.FXML
    private TabPane customerTabpane;
    @javafx.fxml.FXML
    private TableColumn<CartItem, String> proNameTableCol;
    @javafx.fxml.FXML
    private Label totalBillLabel;
    @javafx.fxml.FXML
    private TextField cusPhnNumTextField;
    @javafx.fxml.FXML
    private RadioButton codRadioBtn;
    @javafx.fxml.FXML
    private RadioButton sslCommerzRadioBtn;
    @javafx.fxml.FXML
    private Tab cartTab;
    @javafx.fxml.FXML
    private RadioButton mobileBankingRadioBtn;


   public ArrayList<Product> productList;
   public static   ObservableList<CartItem> cartItem = FXCollections.observableArrayList();

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;


    }


    @javafx.fxml.FXML
    public void initialize()
    {
//         proName;
//    private  int proID,proQuan;
//    private double proPrice;
        proNameTableCol.setCellValueFactory(new PropertyValueFactory<>("proName"));
        priceTableCol.setCellValueFactory(new PropertyValueFactory<>("proPrice"));
        quanTableCol.setCellValueFactory(new PropertyValueFactory<>("proQuan"));

    }

    @javafx.fxml.FXML
    public void toRieviewOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            ToReviewViewController toReviewViewController = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/toReviewView.fxml", "Review" );

        }
        catch (Exception e)
        {

        }
    }


    @javafx.fxml.FXML
    public void customerLogOutOnActionButton(ActionEvent actionEvent)
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
    public void myOrdersOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            MyOrdersController my_order = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/myOrdersView.fxml", "My Order" );

        }
        catch (Exception e)
        {

        }

    }

    @javafx.fxml.FXML
    public void cartOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            CartViewController cartViewController = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/cartView.fxml", "Cart" );

        }
        catch (Exception e)
        {

        }
    }

    @javafx.fxml.FXML
    public void askQuestionOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            AskQuestionViewController askQuestionViewController = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/askQuestionView.fxml", "Ask Question" );

        }
        catch (Exception e)
        {

        }
    }

    @javafx.fxml.FXML
    public void wishlistOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            WishlistViewController wishlistViewController = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/wishlistView.fxml", "Wish List" );

        }
        catch (Exception e)
        {

        }
    }

    @javafx.fxml.FXML
    public void eventActivitiesOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            EventActivitiesViewController eventActivitiesViewController = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/eventActivitiesView.fxml", "Event Activities" );

        }
        catch (Exception e)
        {

        }
    }

    @javafx.fxml.FXML
    public void disscountsOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            DisscountViewController disscountViewController = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/disscountView.fxml", "Discount" );

        }
        catch (Exception e)
        {

        }
    }

    @javafx.fxml.FXML
    public void shopOnActionButton(ActionEvent actionEvent)
    {
        try
        {
            ProductViewController productViewController = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/productView.fxml", "Products" );

        }
        catch (Exception e)
        {

        }

    }

    @javafx.fxml.FXML
    public void puchaseConfirmatoinBtn(ActionEvent actionEvent) {
    }
    public static void addToCart(String proName,Integer proId, Integer proQuan, double proPrice)
    {
        CartItem newItem = new CartItem(
                proName,
                proId,
                proQuan,
                proPrice
        );
       for(CartItem p: cartItem)
       {
          if(p.getProID() == proId)
          {
              p.setProQuan(proQuan);
              p.setProPrice(p.getProPrice()*p.getProQuan());
          }

       }
        tableviewCart.setItems(cartItem);

    }
}