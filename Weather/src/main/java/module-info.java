module a4.aalmanza5.weather {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;
    requires java.net.http;


    opens a4.aalmanza5.weather to javafx.fxml;
    exports a4.aalmanza5.weather;
}