module com.ativ_k.ativ_k {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.ativ_k.ativ_k to javafx.fxml;
    exports com.ativ_k.ativ_k;
}