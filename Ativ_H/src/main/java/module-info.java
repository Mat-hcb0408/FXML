module com.ativ_h.ativ_h {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.ativ_h.ativ_h to javafx.fxml;
    exports com.ativ_h.ativ_h;
}