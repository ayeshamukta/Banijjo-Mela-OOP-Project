package oop.banijjomelaoop.ayesha_2022861;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

import java.io.*;
import java.util.ArrayList;

public class WishlistViewController
{
    @javafx.fxml.FXML
    private TabPane customerTabpane;
    @javafx.fxml.FXML
    private Tab wishlistTab;
    @javafx.fxml.FXML
    private Label wishlistlabel;


    @javafx.fxml.FXML
    public void initialize() {
        String fileLocation = "E:\\Storage\\Banijjo-Mela-OOP-Project\\BanijjoMelaOop\\src\\main\\resources\\oop\\banijjomelaoop\\ayesha_2022861\\wishList.bin";
        File f = new File(fileLocation);
//
        if (f.exists())
        {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileLocation));
                ArrayList<WishList> list  =(ArrayList<WishList>) ois.readObject();
//                ObservableList<WishList> wish = FXCollections.observableArrayList();
//                wish.addAll(list);
//                System.out.println(list);
                StringBuilder sb = new StringBuilder("Wish List \n");
                for(WishList w : list)
                {
                    sb.append("Product Name : ").append(w.getProductName()).append("            Price : ").append(w.getProductPrice()).append("\n");
                }
                wishlistlabel.setText(sb.toString());
                ois.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

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
//

    public static void loadWishList(Product p) {




        String fileLocation = "E:\\Storage\\Banijjo-Mela-OOP-Project\\BanijjoMelaOop\\src\\main\\resources\\oop\\banijjomelaoop\\ayesha_2022861\\wishList.bin";
        File f = new File(fileLocation);



        ArrayList<WishList> wishList = new ArrayList<>();
        String pName = p.getProductName();
        Double pPrice = p.getProductPrice();
        int pId = p.getProductID();
        WishList newWishItem = new WishList(pName,pPrice,pId);


        if (f.exists())
        {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileLocation));
                wishList  =(ArrayList<WishList>) ois.readObject();
                System.out.println(wishList);
                ois.close();
            } catch (Exception e) {
                wishList = new ArrayList<>();
                throw new RuntimeException(e);
            }
        wishList.add(newWishItem);

        if(f.exists())
        {
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileLocation));
                oos.writeObject(wishList);
                oos.close();
//                System.out.println(wishList);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


        }



    }



}



