module com.ativ_j.ativ_j {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.ativ_j.ativ_j to javafx.fxml;
    exports com.ativ_j.ativ_j;
}