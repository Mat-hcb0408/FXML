module com.appcalc.appcalc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.appcalc.appcalc to javafx.fxml;
    exports com.appcalc.appcalc;
}