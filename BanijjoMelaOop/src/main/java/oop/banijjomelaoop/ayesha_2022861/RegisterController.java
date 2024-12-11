package oop.banijjomelaoop.ayesha_2022861;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;


import java.io.*;
import java.util.ArrayList;

public class RegisterController {
    @javafx.fxml.FXML
    private ComboBox<Integer> stallNumComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> slotsComboBox;
    @javafx.fxml.FXML
    private Label registerErrorLabelField;
    @javafx.fxml.FXML
    private Tab registerTab;
    @javafx.fxml.FXML
    private TabPane stallownerTab;
    @javafx.fxml.FXML
    private TextField ownerNameTextField;
    @javafx.fxml.FXML
    private ComboBox<Integer> stallRowComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> businessCategoryComboBoxFields;

    private ObservableList<Stall> registerdShop = FXCollections.observableArrayList();
    @FXML
    private Label dataViewLabelField;


    @javafx.fxml.FXML
    public void initialize() {
        slotsComboBox.getItems().addAll("1/12/24 - 15/12/24, 10:00 am - 2:59 pm", "1/12/24 - 15/12/24, 3:00 pm - 9:00 pm", "16/12/24 - 31/12/24, 10:00 am - 3:00 pm", "16/12/24 - 31/12/24, 2:59 am - 9:00 pm");
        stallRowComboBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        stallNumComboBox.getItems().addAll(101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210);
        businessCategoryComboBoxFields.getItems().addAll("Food", "Clothing", " Cosmetics", "Stationary", "Footwear");


    }

    @javafx.fxml.FXML
    public void salePerformanceOnActionButton(ActionEvent actionEvent) {
        try {
            SalePerformanceController salePerformanceController = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/salePerformanceView.fxml", "Sale Performance");

        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void qAndaOnActionButton(ActionEvent actionEvent) {

        try {
            QandAController qa = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/q&a.fxml", "Q & A");


        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void promotionOnActionButton(ActionEvent actionEvent) {


        try {

            PromotionController pc = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/Promotion.fxml", "Promotion");


        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void manageProductOnActionButton(ActionEvent actionEvent) {
        try {
            ManageProductsController manage_products = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/manageProducts.fxml", "Manage Products");

        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void feedbackOnActionButton(ActionEvent actionEvent) {
        try {
            FeedbackController feed_back = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/feedback.fxml", "Feed Back");

        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void stallOwnerLogOutButtonOnAction(ActionEvent actionEvent) {
        try {
            LoginViewController logout = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/loginView.fxml", "Trade Fair");

        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void postSaleServiceOnActionButton(ActionEvent actionEvent) {
        try {
            PostSaleServiceController post_sale_service = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/postSaleService.fxml", "Post Sale Service");
        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void manageInventoryOnActionButton(ActionEvent actionEvent) {
        try {
            ManageInventoryController manageInventoryController = Utility.sceneSwitch(actionEvent, "/oop/banijjomelaoop/ayesha_2022861/manageInventoryView.fxml", "Manage Inventory");
        } catch (Exception e) {

        }
    }

    public Boolean registerConfirmation() {

        return true;

    }
    String fileLocation = "E:\\Storage\\Banijjo-Mela-OOP-Project\\BanijjoMelaOop\\src\\main\\resources\\stallInfo.bin";
            File f = new File(fileLocation);

    @FXML
    public void loadInfoBtn(ActionEvent actionEvent) {
        for(Stall s: registerdShop)
        {
            System.out.println(s);
        }
        try
        {
            ObjectInputStream ois = new ObjectInputStream(new  FileInputStream(fileLocation));

            ArrayList<Stall> loadStall = (ArrayList<Stall>) ois.readObject();
            registerdShop.setAll(loadStall);

            StringBuilder sb = new StringBuilder("Registerd Stall:\n");
            for (Stall s : loadStall) {
                sb.append(s.toString()).append("\n");
            }


            dataViewLabelField.setText(sb.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void registerOnActionForStall(ActionEvent actionEvent) {
        boolean registerApproval = registerConfirmation();
        if ((slotsComboBox.getValue() == null) || (stallNumComboBox.getValue() == null) || (stallRowComboBox.getValue() == null) || (businessCategoryComboBoxFields.getValue() == null) || (ownerNameTextField.getText().trim().isEmpty()) || (ownerNameTextField.getText().matches("a-xA-Z"))) {
            registerErrorLabelField.setText("Please Enter Valid Input");

        } else if (registerApproval) {
            registerErrorLabelField.setText("Your Registration is Successful");
            Stall newStall = new Stall(

                    stallNumComboBox.getValue(),
                    stallRowComboBox.getValue(),
                    ownerNameTextField.getText(),
                    slotsComboBox.getValue(),
                    businessCategoryComboBoxFields.getValue()

            );
            registerdShop.add(newStall);
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileLocation));
                oos.writeObject(new ArrayList<>(registerdShop));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }


    }
}