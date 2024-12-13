package oop.banijjomelaoop.ayesha_2022861;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;

public class AskQuestionViewController
{
    @javafx.fxml.FXML
    private TabPane customerTabpane;
    @javafx.fxml.FXML
    private Tab askQuestionTab;
    @javafx.fxml.FXML
    private Label answerCointainerLabelofcus;
    @javafx.fxml.FXML
    private TextField cusQuesTextField;
    ArrayList<String> questions;


    @javafx.fxml.FXML
    public void initialize() {


            questions = new ArrayList<>();
            String file = "queries.bin";
            if (new File(file).exists()) {
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                    questions = (ArrayList<String>) ois.readObject();
                } catch (Exception e) {
                    e.printStackTrace();
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


    @javafx.fxml.FXML

    public void askButtonOnAction(ActionEvent actionEvent) {
        String str = cusQuesTextField.getText();
        if (!str.isEmpty()) {
            questions.add(str);
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("queries.bin"))) {
                oos.writeObject(questions);
                answerCointainerLabelofcus.setText("Question saved successfully!");
            } catch (IOException e) {
                e.printStackTrace();
                answerCointainerLabelofcus.setText("Failed to save the question.");
            }
        } else {
            answerCointainerLabelofcus.setText("Please enter a question.");
        }
    }

    @javafx.fxml.FXML
    public void loadQueryBTN(ActionEvent actionEvent) {
        String file = "queries.bin";
        File f = new File(file);
        if (f.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                questions = (ArrayList<String>) ois.readObject();
                answerCointainerLabelofcus.setText(String.join("\n ", questions));
//                answerCointainerLabelofcus.setText(questions.toString(s));
            } catch (Exception e) {
                e.printStackTrace();
                answerCointainerLabelofcus.setText("Failed to load questions.");
            }
        } else {
            answerCointainerLabelofcus.setText("No questions found.");
        }
    }




}