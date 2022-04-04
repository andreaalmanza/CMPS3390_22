module a8.aalmanza5.javafxtodo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires org.json;


    opens a8.aalmanza5.javafxtodo to javafx.fxml;
    exports a8.aalmanza5.javafxtodo;
}