module com.ativ_e.ativ_e {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.ativ_e.ativ_e to javafx.fxml;
    exports com.ativ_e.ativ_e;
}