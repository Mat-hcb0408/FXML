module org.ativ_o.ativ_o {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.ativ_o.ativ_o to javafx.fxml;
    exports org.ativ_o.ativ_o;
}