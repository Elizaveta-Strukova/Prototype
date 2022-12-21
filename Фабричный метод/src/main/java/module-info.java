module com.example.fabrica {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fabrica to javafx.fxml;
    exports com.example.fabrica;
}