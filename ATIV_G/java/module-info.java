module org.g.ativ_g {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.g.ativ_g to javafx.fxml;
    exports org.g.ativ_g;
}