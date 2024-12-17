package oop.banijjomelaoop.ayesha_2022861;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class CartViewController implements Serializable
{
    @javafx.fxml.FXML
    private Label errorAlertLabelText;
    @javafx.fxml.FXML
    private ComboBox<String> cusDivisionComboBox;
    @javafx.fxml.FXML
    private TextField cusAddressTextField;
    @javafx.fxml.FXML
    private TextField customerNameTextField;
    @javafx.fxml.FXML
    private TabPane customerTabpane;
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
    Integer orderId = 000000;

    ToggleGroup tg;

   public ArrayList<Product> productList;
   public static   ObservableList<CartItem> cartItem = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    private Label cartListLabel;

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;



    }
    Double totalAmount = (double) 0;
    StringBuilder sb = new StringBuilder("Your Items : \n");


    @javafx.fxml.FXML
    public void initialize()
    {
        try
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cartList.bin"));
            ArrayList<Cart> l= (ArrayList<Cart>) ois.readObject();



            for(Cart item: l)
            {
                sb.append("Product name : ").append(item.getpName()).append("               ").append("Quantity : ").append(item.getQuantity()).append("                ").append("Price : ").append(item.getPrice()).append("\n");
                totalAmount+= item.getPrice();
            }

            cartListLabel.setText(sb.toString());
            ois.close();
            totalBillLabel.setText(totalAmount.toString());

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        tg = new ToggleGroup();
        mobileBankingRadioBtn.setToggleGroup(tg);
        sslCommerzRadioBtn.setToggleGroup(tg);
        codRadioBtn.setToggleGroup(tg);


        cusDivisionComboBox.getItems().addAll("Dhaka","Barishal","Chattogram","Khulna","Rajshahi","Rangpur","Mymensing","Sylhet") ;


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

    String payment = " ";



    @javafx.fxml.FXML
    public void puchaseConfirmatoinBtn(ActionEvent actionEvent) throws FileNotFoundException {
        orderId = orderId+1;
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        if(mobileBankingRadioBtn.isSelected() || sslCommerzRadioBtn.isSelected() )
        {
            errorAlertLabelText.setText("Currently Mobile Banking & SSL COMMERZ Service is Unavailable");
        }
        else
        {
            if(customerNameTextField.getText().trim().isEmpty() || cusPhnNumTextField.getText().trim().isEmpty() || cusDivisionComboBox.getValue() == null || cusAddressTextField.getText().trim().isEmpty())
            {


                errorAlertLabelText.setText("Please Fill out All Valid Input");


            }
            else{

                payment = "COD";



                String biillingadd ="Customer Name : " + customerNameTextField.getText() +"       Phone Number :"+  cusPhnNumTextField.getText()+"\n";
                String shippingAdd = "Division : " + cusDivisionComboBox.getValue() +"       Address : "+  cusAddressTextField.getText()+ "       Payement Method : "+payment+ "\n";
                StringBuilder bill = new StringBuilder("Your Bill \n");
                bill.append(sb.toString()).append("\n").append("Total Amount :").append(totalAmount).append("          Order Id: ").append(orderId).append("\n").append("Date : ").append(date).append("    ").append("Time : ").append(time).append("\n").append(biillingadd).append("\n").append(shippingAdd);


                PdfWriter writer = new PdfWriter("Your Bill.pdf");
                PdfDocument pdf = new PdfDocument(writer);
                Document document = new Document(pdf);
                document.add(new Paragraph(bill.toString()));
                document.close();
                errorAlertLabelText.setText(" ");
            }


        }

//        ArrayList<Cart> orderInfo = new ArrayList<>();




    }

public static void addToCart(Product p, Integer q)
    {
//        CartItem newItem = new CartItem(
//                proName,
//                proId,
//                proQuan,
//                proPrice
//        );
//       for(CartItem p: cartItem)
//       {
//          if(p.getProID() == proId)
//          {
//              p.setProQuan(proQuan);
//              p.setProPrice(p.getProPrice()*p.getProQuan());
//          }
//
//       }
//        tableviewCart.setItems(cartItem);
        String name = p.getProductName();
        Double price = p.getProductPrice();
        Integer quantity = q;

        Double updatedPrice= price*quantity;

        Cart newItem = new Cart(name,quantity,updatedPrice);
        ArrayList<Cart> cartList = new ArrayList<>();



        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cartList.bin"))) {
            cartList = (ArrayList<Cart>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // No existing cart, continue with empty list
        }
        cartList.add(newItem);



       try
       {
           ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cartList.bin"));
           oos.writeObject(cartList);
           oos.close();
           System.out.println(cartList);

       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }
}