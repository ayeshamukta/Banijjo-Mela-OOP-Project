package oop.banijjomelaoop.ayesha_2022861;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import jdk.internal.org.objectweb.asm.util.TraceClassVisitor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ProductViewController
{
//    private List<Product> cartItems = new ArrayList<>();
//    private ObservableList<Product>productForView;
//
//    private ArrayList<Product> productList;
    @javafx.fxml.FXML
    private FlowPane productContainer;


    @javafx.fxml.FXML
    public void initialize()
    {
        List<Product> products = ProductData.getProducts();
        for(Product p: products)
        {
            VBox dataContainer = createProductCard(p);
            productContainer.getChildren().add(dataContainer);
        }



    }

    private VBox createProductCard(Product p)
    {
        List<Product> cartItem = new ArrayList<>();

        //Box
        VBox newBox = new VBox(20);
        newBox.setStyle("-fx-border-color: #ddd; -fx-border-width: 1; -fx-padding: 10; -fx-background-color: #f9f9f9; -fx-border-radius: 5; -fx-background-radius: 5;");
        newBox.setPrefWidth(100);
        newBox.setMaxWidth(100);

        //Image
        ImageView imgView = new ImageView();
        if (p.getImgPath() != null )
        {
            String imagePath = p.getImgPath();
            imgView.setImage(new Image(imagePath));
        }
        imgView.setFitWidth(80);
        imgView.setFitHeight(80);
        imgView.setPreserveRatio(true);

        //Name label
        Label name = new Label("Name : "+ p.getProductName());
//        Price Label

        //        spinner
        Spinner<Integer> spinner = new Spinner<>();
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100);
        spinner.setValueFactory(valueFactory);
        spinner.setLayoutX(50);
        spinner.setPrefWidth(120);

        Label price = new Label(String.format("Price : " + String.valueOf(p.getProductPrice())));
//        button
        Button btn = new Button("Add to Cart");
        btn.setOnAction(actionEvent -> CartViewController.addToCart(p.getProductName(),p.getProductID(),spinner.getValue(), p.getProductPrice()));




        newBox.getChildren().addAll(imgView,name,price,btn,spinner);
        return newBox;

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


}