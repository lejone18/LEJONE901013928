module com.example.countries_5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.countries_5 to javafx.fxml;
    exports com.example.countries_5;
}