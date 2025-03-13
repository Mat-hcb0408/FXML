module com.ativ_c.ativ_d {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.ativ_c.ativ_d to javafx.fxml;
    exports com.ativ_c.ativ_d;
}