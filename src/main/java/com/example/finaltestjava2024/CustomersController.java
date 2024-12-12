package com.example.finaltestjava2024;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;


public class CustomersController implements Initializable {
    @FXML
    private Button allCustomersButton;

    @FXML
    private TableColumn<customer, String> colCompany;

    @FXML
    private TableColumn<customer, String> colCountry;

    @FXML
    private TableColumn<customer, String> colCreatedAt;

    @FXML
    private TableColumn<customer, String> colEmail;

    @FXML
    private TableColumn<customer, String> colFirst;

    @FXML
    private TableColumn<customer, String> colId;

    @FXML
    private TableColumn<customer, String> colLast;

    @FXML
    private Button domesticCustomersButton;

    @FXML
    private Label rowsInTableLabel;

    @FXML
    private TableView<customer> tableViewCustomers;

    @FXML
    private Label titleLabel;

    @FXML
    protected void onAllCustomersButtonClick() {
        rowsInTableLabel.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onDomesticCustomersButtonClick() {
        rowsInTableLabel.setText("Domestic Customers to be found.");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {



    }
}