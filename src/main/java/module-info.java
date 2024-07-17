module com.example.smilingproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.smilingproject to javafx.fxml;
    exports com.example.smilingproject;
}