package oop.banijjomelaoop.ayesha_2022861;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.util.ArrayList;

public class PromotionController implements Serializable {
    @javafx.fxml.FXML
    private TextField promoCodeForPromotion;
    @javafx.fxml.FXML
    private TextField disscountTextFieldForPromotion;
    @javafx.fxml.FXML
    private  ComboBox<Integer> prouctsComboBoxForPromotion;
    @javafx.fxml.FXML
    private TabPane stallownerTab;
    @javafx.fxml.FXML
    private TableColumn<Promotion, String> codeColoumnForPromotion;
    @javafx.fxml.FXML
    private TableView<Promotion> promotionTableView;
    @javafx.fxml.FXML
    private Tab promotionTab;
    @javafx.fxml.FXML
    private TableColumn<Promotion, Integer> percentageColoumnForPromotion;

    @javafx.fxml.FXML
    private TableColumn<Promotion, Integer> productIdColoumnForPromotion;

    ObservableList<Promotion> promos = FXCollections.observableArrayList();

    String pIdLocation = "E:\\Storage\\Banijjo-Mela-OOP-Project\\BanijjoMelaOop\\src\\main\\resources\\id.bin";
    File f = new File(pIdLocation);

    public void initialize()
    {

//        productIdColoumnForPromotion.setCellValueFactory(cellData -> cellData.getValue().productNameProperty());
        productIdColoumnForPromotion.setCellValueFactory(new PropertyValueFactory<>("id"));
        codeColoumnForPromotion.setCellValueFactory(new PropertyValueFactory<>("code"));
        percentageColoumnForPromotion.setCellValueFactory(new PropertyValueFactory<>("disscount"));
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
    public void updateButtonOnActionForPromotion(ActionEvent actionEvent) {
        Integer id= prouctsComboBoxForPromotion.getValue();
        Integer dis = Integer.parseInt(disscountTextFieldForPromotion.getText());
        String disCode = promoCodeForPromotion.getText();
//        int id, int disscount, String code
        Promotion newPromotion = new Promotion(id,dis,disCode);
        promos.add(newPromotion);


        String fileLocation = "E:\\Storage\\Banijjo-Mela-OOP-Project\\BanijjoMelaOop\\src\\main\\resources\\oop\\banijjomelaoop\\promotionInfo.bin";
        File promoFile = new File (fileLocation);

        if(promoFile.exists())
        {
            try {

                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileLocation,true));
                oos.writeObject(new ArrayList<> (promos) );

                oos.close();

            } catch (RuntimeException e) {

                throw new RuntimeException(e);
            } catch (FileNotFoundException e) {
                System.out.println("File Not Found");
                throw new RuntimeException(e);
            } catch (IOException e) {
                System.out.println("Error");
                throw new RuntimeException(e);
            }
        }

        if(promoFile.exists())
        {
            try
            {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileLocation));

                ArrayList<Promotion> promosFromFile = (ArrayList<Promotion>) ois.readObject();
                promos.addAll(promosFromFile);

                promotionTableView.setItems(promos);
                ois.close();




            } catch (IOException e) {
                System.out.println("Can't read");
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                System.out.println("Can't read");
                throw new RuntimeException(e);
            }
        }

    }

    @javafx.fxml.FXML
    public void loadproductForComboBox(ActionEvent actionEvent) {
        if(f.exists())
        {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pIdLocation));

                String id = (String) ois.readObject();
                ois.close();
                Integer prodictID = Integer.valueOf(id);
                prouctsComboBoxForPromotion.getItems().add(prodictID);

            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
        else
        {
            System.out.println("Can't write the file");
        }

    }
}
