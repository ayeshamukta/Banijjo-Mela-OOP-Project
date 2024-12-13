package oop.banijjomelaoop.ayesha_2022861;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.util.ArrayList;

public class WishlistViewController
{
    @javafx.fxml.FXML
    private TabPane customerTabpane;
    @javafx.fxml.FXML
    private Tab wishlistTab;
    @javafx.fxml.FXML
    private TableColumn<WishList, Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn<WishList, String> nameCol;
    @javafx.fxml.FXML
    private TableView<WishList> wishListTableView;
    @javafx.fxml.FXML
    private TableColumn<WishList, Double> priceCol;



    @javafx.fxml.FXML
    public void initialize() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("productName"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("productPrice"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("proID"));
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
    public static void loadWishList(String name, Double price, int id) {
        ArrayList<WishList> wishListArrayList = new ArrayList<>();
        WishList newWishList = new WishList(name, price, id);
        wishListArrayList.add(newWishList);

        String fileLocation = "E:\\Storage\\Banijjo-Mela-OOP-Project\\BanijjoMelaOop\\src\\main\\resources\\oop\\banijjomelaoop\\ayesha_2022861\\wishList.bin";
        File f = new File(fileLocation);

        // Declare oos without final keyword
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileLocation, true))) {
            // If file exists and has data, use append mode.
            if (f.exists() && f.length() > 0) {
                oos.writeObject(newWishList);
            } else {
                // If file is new, write the object and create the file.
                oos.writeObject(newWishList);
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to write to file", e);
        }



    }


    @javafx.fxml.FXML
    public void loadWishListBtn(ActionEvent actionEvent) {
        String fileLocation = "E:\\Storage\\Banijjo-Mela-OOP-Project\\BanijjoMelaOop\\src\\main\\resources\\oop\\banijjomelaoop\\ayesha_2022861\\wishList.bin";
        File f = new File(fileLocation);
        if (f.exists() && f.length() > 0) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
                ObservableList<WishList> observableList = FXCollections.observableArrayList();
                while (true) {
                    try {
                        WishList wish = (WishList) ois.readObject();
                        observableList.add(wish);
                    } catch (EOFException eof) {
                        break; // End of file reached
                    }
                }
                wishListTableView.setItems(observableList);
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Failed to load wishlist: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.out.println("Wishlist file does not exist or is empty.");
        }

    }

}