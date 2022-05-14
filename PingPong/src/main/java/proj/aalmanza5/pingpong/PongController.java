package proj.aalmanza5.pingpong;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PongController implements Initializable{
    @FXML
    private AnchorPane scene;
    @FXML
    public Button btnGameWindow;
    @FXML
    private Label welcomeText;
    @FXML
    private Label gametitle;
    @FXML
    private Circle circle;

    public PongController() {
    }

    @FXML
    protected void onHelloButtonClick(Event e) {

        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    public void onGamePlayClick(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(PongApplication.class.getResource("gameplay-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),600, 400);
        Stage stage = (Stage) btnGameWindow.getScene().getWindow();
        stage.setScene(scene);
    }
    // ball at intro bouncing
    Timeline timeline = new Timeline(new KeyFrame(Duration.millis(6), new EventHandler<ActionEvent>() {

        double deltaX = 2;
        double deltaY = 2;

        @Override
        public void handle(ActionEvent actionEvent) {
            circle.setLayoutX(circle.getLayoutX() + deltaX);
            circle.setLayoutY(circle.getLayoutY() + deltaY);

            Bounds bounds = scene.getBoundsInLocal();
            boolean rightBorder = circle.getLayoutX() >= (bounds.getMaxX() - circle.getRadius());
            boolean leftBorder = circle.getLayoutX() <= (bounds.getMinX() + circle.getRadius());
            boolean bottomBorder = circle.getLayoutY() >= (bounds.getMaxY() - circle.getRadius());
            boolean topBorder = circle.getLayoutY() <= (bounds.getMinY() + circle.getRadius());

            if (rightBorder || leftBorder) {
                deltaX *= -1;
            }
            if (bottomBorder || topBorder) {
                deltaY *= -1;
            }
        }
    }));


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }




}