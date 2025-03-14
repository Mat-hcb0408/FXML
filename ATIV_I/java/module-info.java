module org.i.ativ_i {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.i.ativ_i to javafx.fxml;
    exports org.i.ativ_i;
}