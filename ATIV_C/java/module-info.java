module com.ativ_c.ativ_c {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.ativ_c.ativ_c to javafx.fxml;
    exports com.ativ_c.ativ_c;
}