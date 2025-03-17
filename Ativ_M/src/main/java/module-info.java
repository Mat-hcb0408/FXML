module com.example.ativ_m {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ativ_m to javafx.fxml;
    exports com.example.ativ_m;
}