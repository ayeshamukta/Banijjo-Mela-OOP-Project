package oop.banijjomelaoop.Asik2030753;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class User3Goal1 {

    @FXML private TableView<Owner> stallTableView;
    @FXML private TableColumn<Owner, String> stallOwnerNametableCol;
    @FXML private TableColumn<Owner, String> idtableTableCol;
    @FXML private TableColumn<Owner, String> descriptionTableCol;
    @FXML private TableColumn<Owner, String> statusTableCol;

    @FXML private TextField stallOwnerNameTextField;
    @FXML private TextField idTextField;
    @FXML private TextArea descriptionTextArea;

    private ObservableList<Owner> ownerList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        stallOwnerNametableCol.setCellValueFactory(new PropertyValueFactory<>("stallOwnerName"));
        idtableTableCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        descriptionTableCol.setCellValueFactory(new PropertyValueFactory<>("description"));
        statusTableCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        stallTableView.setItems(ownerList);
    }

    @FXML
    void submitButtonOnClick(ActionEvent event) {
        Owner newOwner = new Owner(
                stallOwnerNameTextField.getText(),
                idTextField.getText(),
                descriptionTextArea.getText(),
                "Pending"
        );

        ownerList.add(newOwner);

        stallOwnerNameTextField.clear();
        idTextField.clear();
        descriptionTextArea.clear();
    }
}