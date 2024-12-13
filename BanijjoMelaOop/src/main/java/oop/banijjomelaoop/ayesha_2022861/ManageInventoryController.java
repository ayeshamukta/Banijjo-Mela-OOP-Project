package oop.banijjomelaoop.ayesha_2022861;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;


public class ManageInventoryController {
    @javafx.fxml.FXML
    private ComboBox<String> ediableComboBoxForManageInventory;
    @javafx.fxml.FXML
    private Tab manageInventoryTab;
    @javafx.fxml.FXML
    private ComboBox<Integer> productIdComboBoxForManageInventory;
    @javafx.fxml.FXML
    private TextField enterValueTextFieldForManageInventory;
    @javafx.fxml.FXML
    private TabPane stallownerTab;
    @javafx.fxml.FXML
    private Label inventoryListLabel;

    ArrayList<Product> prolist;

    public void initialize()
    {
        prolist = new ArrayList<>();

        String pIdLocation = "E:\\Storage\\Banijjo-Mela-OOP-Project\\BanijjoMelaOop\\src\\main\\resources\\id.bin";
        File f = new File(pIdLocation);

        if(f.exists())
        {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pIdLocation));

                String id = (String) ois.readObject();
                ois.close();
                Integer prodictID = Integer.valueOf(id);
                productIdComboBoxForManageInventory.getItems().add(prodictID);

            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
        else
        {
            System.out.println("Can't read the file");
        }

        ediableComboBoxForManageInventory.getItems().addAll("Product Name", "Quantity");


        String fileLoacation = "E:\\Storage\\Banijjo-Mela-OOP-Project\\ProductInfo.bin";
        File file = new File(fileLoacation);

        if(file.exists())
        {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileLoacation));
                prolist = (ArrayList<Product>) ois.readObject();
                for(Product p: prolist)
                {
                    String str = "Name : " +p.getProductName()
                            + " Product Id : " + p.getProductID() + " Quantity : " + p.getProductQuantity();
                    inventoryListLabel.setText(str);
                }
                ois.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }



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
    public void updateBtnOnActionlForManageInventory(ActionEvent actionEvent)
    {
        Integer pId = productIdComboBoxForManageInventory.getValue();
        String editcol = ediableComboBoxForManageInventory.getValue();
        String  val = enterValueTextFieldForManageInventory.getText();

        String fileLoacation = "E:\\Storage\\Banijjo-Mela-OOP-Project\\ProductInfo.bin";
        File f = new File(fileLoacation);

       try
       {
           ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileLoacation));
           prolist = (ArrayList<Product>) ois.readObject();
//           ArrayList<Product>
           ois.close();


           for(Product produts : prolist)
           {
               if(produts.getProductID() == pId)
               {
                   switch (editcol)
                   {
                       case "Product Name" :
                           produts.setProductName(val);
                           break;

                       case "Quantity" :
                           produts.setProductQuantity(Integer.parseInt(val));
                           break;
                   }
                   break;
               }
           }

           ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileLoacation));
           oos.writeObject(prolist);
           oos.close();

           if(f.exists())
           {
               try {
                   ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(fileLoacation));
                   prolist = (ArrayList<Product>) ois1.readObject();
                   for(Product p: prolist)
                   {
                       String str = "Name : " +p.getProductName()
                               + " Product Id : " + p.getProductID() + " Quantity : " + p.getProductQuantity();
                       inventoryListLabel.setText(str);
                   }
                   ois.close();
               } catch (Exception e) {
                   throw new RuntimeException(e);
               }
           }



       } catch (IOException e) {
           throw new RuntimeException(e);
       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       }


    }
}
