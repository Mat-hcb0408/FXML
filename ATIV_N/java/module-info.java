module org.ativ_m.ativ_m {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.ativ_m.ativ_m to javafx.fxml;
    exports org.ativ_m.ativ_m;
}