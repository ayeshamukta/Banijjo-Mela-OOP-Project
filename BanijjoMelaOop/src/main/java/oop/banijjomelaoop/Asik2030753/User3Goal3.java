package oop.banijjomelaoop.Asik2030753;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class User3Goal3 {

    @FXML private ComboBox<String> complaintsComboBox;
    @FXML private TableColumn<StallComplaint, String> complaintsTableCol;
    @FXML private TableColumn<StallComplaint, String> descriptionTableCol;
    @FXML private TextArea descriptionTextArea;
    @FXML private TableView<StallComplaint> goal3TableView;
    @FXML private TableColumn<StallComplaint, String> stallIdTableCol;
    @FXML private TextField stallIdTextField;
    @FXML private Button viewExsistingComplaintsButtonOnClick;

    private ObservableList<StallComplaint> complaintList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Configure table columns
        complaintsTableCol.setCellValueFactory(new PropertyValueFactory<>("complaintType"));
        stallIdTableCol.setCellValueFactory(new PropertyValueFactory<>("stallId"));
        descriptionTableCol.setCellValueFactory(new PropertyValueFactory<>("description"));

        // Set up combo box
        complaintsComboBox.getItems().addAll(
                "Electrical Issue",
                "Plumbing Problem",
                "Structural Damage",
                "Sanitation Concern",
                "Other"
        );

        // Load sample data
        complaintList.addAll(
                new StallComplaint("Electrical Issue", "ST-101", "Lights not working", "Pending"),
                new StallComplaint("Plumbing Problem", "ST-205", "Water leakage", "In Progress"),
                new StallComplaint("Structural Damage", "ST-312", "Broken counter", "Resolved")
        );

        goal3TableView.setItems(complaintList);
    }

    @FXML
    void viewExsistingComplaintsButtonOnClick(ActionEvent event) {
        String selectedType = complaintsComboBox.getValue();
        String stallId = stallIdTextField.getText().trim();

        if ((selectedType == null || selectedType.isEmpty()) && stallId.isEmpty()) {
            goal3TableView.setItems(complaintList); // Show all if no filters
            return;
        }

        ObservableList<StallComplaint> filteredList = FXCollections.observableArrayList();
        for (StallComplaint complaint : complaintList) {
            boolean typeMatches = selectedType == null || selectedType.isEmpty() ||
                    complaint.getComplaintType().equalsIgnoreCase(selectedType);
            boolean idMatches = stallId.isEmpty() ||
                    complaint.getStallId().equalsIgnoreCase(stallId);

            if (typeMatches && idMatches) {
                filteredList.add(complaint);
            }
        }

        goal3TableView.setItems(filteredList);
    }
}