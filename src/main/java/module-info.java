module com.example.finaltestjava2024 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finaltestjava2024 to javafx.fxml;
    exports com.example.finaltestjava2024;
}