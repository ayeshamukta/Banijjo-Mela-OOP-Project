package oop.banijjomelaoop.ayesha_2022861;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.util.ArrayList;

public class EventActivitiesViewController
{
    @FXML
    private TabPane customerTabpane;
    @FXML
    private Tab eventActivitiesTab;
    @FXML
    private TextField orderIdTextField;
    @FXML
    private ComboBox<String> eventsComboBox;
    ArrayList<Event> eventArrayList = new ArrayList<>();
    @FXML
    private Label eventLabel;

    @FXML
    public void initialize() {
        String loacation = "E:\\Storage\\Banijjo-Mela-OOP-Project\\event.bin";
        File file = new File(loacation);
//
        if(file.exists())
        {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(loacation));
                eventArrayList = (ArrayList<Event>) ois.readObject();
                StringBuilder sb = new StringBuilder();

                for(Event e: eventArrayList)
                {
                    sb.append("Events : ").append(e.getEvent()).append("       Ordre Id : ").append(e.getOrderId()).append("\n");


                }
                eventLabel.setText(sb.toString());

                ois.close();



            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            System.out.println("File doesn't exist");
        }

        eventsComboBox.getItems().addAll("a","b","c");


    }

    @FXML
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

    @FXML
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

    @FXML
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

    @FXML
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

    @FXML
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

    @FXML
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

    @FXML
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

    @FXML
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

    @FXML
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

    @FXML
    public void eventSubmitbtn(ActionEvent actionEvent) {

        String loacation = "E:\\Storage\\Banijjo-Mela-OOP-Project\\event.bin";
        File file = new File(loacation);


        if(file.exists())
        {
              String events = eventsComboBox.getValue();
        int orderid = Integer.parseInt(orderIdTextField.getText());
        Event newEvent = new Event(events,orderid);
        eventArrayList.add(newEvent);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("event.bin"));
            oos.writeObject(eventArrayList);
            oos.close();
            String str = "Event : " + events + "    Order Id : "+ orderid;
            eventLabel.setText(str);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }
        else {
            System.out.println("File doesn't exist");
        }











    }
}