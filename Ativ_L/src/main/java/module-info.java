module com.ativ_l.ativ_l {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.ativ_l.ativ_l to javafx.fxml;
    exports com.ativ_l.ativ_l;
}