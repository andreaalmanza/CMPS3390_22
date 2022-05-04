package proj.aalmanza5.pingpong;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;


import java.io.IOException;

public class PongController {
    @FXML
    public Button btnGameWindow;
    @FXML
    private Label welcomeText;

    public PongController() {
    }

    @FXML
    protected void onHelloButtonClick(Event e) {

        welcomeText.setText("Welcome to JavaFX Application!");


    }
    @FXML
    public void onGamePlayClick(ActionEvent event) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(PongApplication.class.getResource("gameplay-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 700);
        //Stage stage = new Stage();
        Stage stage = (Stage) btnGameWindow.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        // specifies the modality for a new window
       // stage.initModality(Modality.NONE);
        stage.show(); */


        FXMLLoader fxmlLoader = new FXMLLoader(PongApplication.class.getResource("gameplay-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),600, 400);
        //ChatViewController chatViewController = fxmlLoader.getController();
        //chatViewController.setClient(client);
        Stage stage = (Stage) btnGameWindow.getScene().getWindow();
        //stage.setOnHidden(event -> {client.closeEverything();}); //
        stage.setScene(scene);
    }




}