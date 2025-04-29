package oop.banijjomelaoop.Asik2030753;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class User3goal2 {

    @FXML
    private TableColumn<Complaint, String> complaintsTableCol;

    @FXML
    private TableColumn<Complaint, String> descriptionTableaCol;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private RadioButton fileNewComplaintsRadioButton;

    @FXML
    private TableView<Complaint> goal2TableView;

    @FXML
    private TextField stallIDTextField;

    @FXML
    private TableColumn<Complaint, String> stallIdTableCol;

    @FXML
    private TextField statusTextField;

    @FXML
    private RadioButton viewExisistingComplaintsRadioButton;

    private ObservableList<Complaint> complaintList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Setup table columns
        stallIdTableCol.setCellValueFactory(new PropertyValueFactory<>("stallId"));
        descriptionTableaCol.setCellValueFactory(new PropertyValueFactory<>("description"));
        complaintsTableCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Set table data
        goal2TableView.setItems(complaintList);

        // Setup radio buttons
        ToggleGroup group = new ToggleGroup();
        fileNewComplaintsRadioButton.setToggleGroup(group);
        viewExisistingComplaintsRadioButton.setToggleGroup(group);
        fileNewComplaintsRadioButton.setSelected(true);
    }

    @FXML
    void submitButtonOnClick(ActionEvent event) {
        if (fileNewComplaintsRadioButton.isSelected()) {
            // Add new complaint
            Complaint complaint = new Complaint(
                    stallIDTextField.getText(),
                    descriptionTextArea.getText(),
                    statusTextField.getText()
            );
            complaintList.add(complaint);

            // Clear fields
            stallIDTextField.clear();
            descriptionTextArea.clear();
            statusTextField.clear();
        } else {
            // Refresh view
            goal2TableView.refresh();
        }
    }
}