module com.ativ_b.ativ_b {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.ativ_b.ativ_b to javafx.fxml;
    exports com.ativ_b.ativ_b;
}