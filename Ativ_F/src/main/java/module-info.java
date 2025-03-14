module com.ativ_f.ativ_f {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.ativ_f.ativ_f to javafx.fxml;
    exports com.ativ_f.ativ_f;
}