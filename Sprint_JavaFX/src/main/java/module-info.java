module presentation.sprint_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens presentation.sprint_javafx to javafx.fxml;
    exports presentation.sprint_javafx;
}