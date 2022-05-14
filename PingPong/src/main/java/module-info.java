module proj.aalmanza5.pingpong {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;


    opens proj.aalmanza5.pingpong to javafx.fxml;
    exports proj.aalmanza5.pingpong;
}