module com.example.strukova1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.strukova1 to javafx.fxml;
    exports com.example.strukova1;
}