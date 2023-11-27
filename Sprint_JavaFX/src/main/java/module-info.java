module guipresentation.sprint_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens guipresentation.sprint_javafx to javafx.fxml;
    exports guipresentation.sprint_javafx;
}