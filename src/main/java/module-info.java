module com.example.aswinslab1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.aswinslab1 to javafx.fxml;
    exports com.example.aswinslab1;
}