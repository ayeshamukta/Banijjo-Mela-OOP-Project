package oop.banijjomelaoop.ayesha_2022861;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class DisscountViewController
{
    @javafx.fxml.FXML
    private Tab disscountTab;
    @javafx.fxml.FXML
    private TabPane customerTabpane;
    @javafx.fxml.FXML
    private Label cuponView;

    @javafx.fxml.FXML
    public void initialize() {

        String fileLoaction = "E:\\Storage\\Banijjo-Mela-OOP-Project\\BanijjoMelaOop\\src\\main\\resources\\oop\\banijjomelaoop\\promotionInfo.bin";
        File f = new File(fileLoaction);

        String productInfo = "E:\\Storage\\Banijjo-Mela-OOP-Project\\ProductInfo.bin";
        File productFile = new File(productInfo);

        if(f.exists())
        {
            try {

                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileLoaction));
                ArrayList<Promotion> promo = (ArrayList<Promotion>) ois.readObject();
                StringBuilder sb = new StringBuilder("Your Promos\n");

                ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(productInfo));
                ArrayList<Product> product = (ArrayList<Product>) ois2.readObject();



                for(Promotion p: promo)
                {
                    String proName = " ";
                    for(Product pro : product)
                    {
                        if(p.getId() == pro.getProductID())
                        {
                            proName  = pro.getProductName();
                            sb.append("Product Name : ").append(proName).append("                       Disscounted Amount : ").append(p.getDisscount()).append("%").append( "           Promo Code : ").append(p.getCode()).append("\n");
                        }
                        else
                        {
                            return;
                        }
                    }



                }
                cuponView.setText(sb.toString());
                ois.close();



            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        else
        {
            System.out.println("File Doesn't exist");
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
}