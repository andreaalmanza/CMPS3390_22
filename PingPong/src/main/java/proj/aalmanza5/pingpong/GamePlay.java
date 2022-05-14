package proj.aalmanza5.pingpong;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;



public class GamePlay implements Runnable, Initializable {

    private Paint paint;
    public static final int WIDTH = 800;
    public static final int HEIGHT = WIDTH * 9/16;

    public boolean isPlaying = false;

    private final int FPS = 1000/30;
    private Thread gameThread;

  //  private Ball ball;
 //  private Paddles paddle1;
   // private Paddles paddle2;

    public void GamePlay() {

    }
    @FXML
    private AnchorPane gamePane;
    @FXML
    private Circle ballCircle;
    @FXML
    private Rectangle paddle1Rec;
    private int paddle1RecY;
    @FXML
    private Rectangle paddle2Rec;
    private int paddle2RecY;




    @Override
    public void run() {
        // game loop
        while(isPlaying){
            update();
            draw();
            sleep();
        }


    }
    private void update(){
       new Ball();
       new Paddles();
    }

    private void draw() {
        Circle ballCircle = this.ballCircle;
        Rectangle paddle1Rec = this.paddle1Rec;
        Rectangle paddle2Rec = this.paddle2Rec;
    }

    

    public void start(){
        gameThread = new Thread(this);
        gameThread.start();
        isPlaying = true;
    }

    public void pause(){
        try {
            isPlaying = false;
            gameThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void sleep(){
        try {
            gameThread.sleep(FPS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @FXML
    public void onKeyPressed(KeyEvent event){
       /* if(event.getCode() == KeyCode.UP){ //testing
            System.out.println("Up key pressed");}*/



    }

    @FXML
    public void OnKeyReleased(KeyEvent event) {
    }
    private EventHandler<KeyEvent> OnKeyReleased = new EventHandler<KeyEvent>() {
        @Override
        public void handle(KeyEvent event) {
            switch(event.getCode()) {
                case W:
                case S:
                case PAGE_UP:
                case PAGE_DOWN:

            }
        }
    };
    private EventHandler<KeyEvent> onKeyPressed = new EventHandler<KeyEvent>() {
        @Override
        public void handle(KeyEvent event) {
            switch(event.getCode()) {
                case W -> {
                    paddle1RecY = -6;
                    break;
                }
                case S -> {
                    paddle1RecY = 6;
                    break;
                }
                case PAGE_UP -> {
                    paddle2RecY = -6;
                    break;
                }
                case PAGE_DOWN -> {
                    paddle2RecY = 6;
                    break;
                }

            }
        }
    };
    Timeline timeline = new Timeline(new KeyFrame(Duration.millis(5), new EventHandler<ActionEvent>() {
        double sceneX = 2;
        double sceneY = 2;
        @Override
        public void handle(ActionEvent event) {
            ballCircle.setLayoutX(ballCircle.getLayoutX() + sceneX);
            ballCircle.setLayoutX(ballCircle.getLayoutY() + sceneY);

            Bounds bounds = gamePane.getBoundsInLocal();
            boolean bottomBorder = ballCircle.getLayoutY() >= (bounds.getMaxY() - ballCircle.getRadius());
            boolean topBorder = ballCircle.getLayoutY() <= (bounds.getMinY() + ballCircle.getRadius());
            if(bottomBorder || topBorder){
                sceneY *= -1;
            }

        }
    }));
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
       // Ball ball = new Ball();  // new ball

        //Paddles paddle1 = new Paddles(); // new paddles
        //Paddles paddle2 = new Paddles();
    }

    public static int sign(double direction){
        if(direction <= 0)
            return -1;
        else
            return 1;
    }

   
}
