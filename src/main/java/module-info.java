module com.example.finaltestjava2024 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.finaltestjava2024 to javafx.fxml;
    exports com.example.finaltestjava2024;
}