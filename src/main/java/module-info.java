module com.example.cg {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.cg to javafx.fxml;
    exports com.example.cg;
}