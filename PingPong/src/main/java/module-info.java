module proj.aalmanza5.pingpong {
    requires javafx.controls;
    requires javafx.fxml;


    opens proj.aalmanza5.pingpong to javafx.fxml;
    exports proj.aalmanza5.pingpong;
}