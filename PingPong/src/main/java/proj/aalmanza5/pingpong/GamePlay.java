package proj.aalmanza5.pingpong;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;

public class GamePlay implements Runnable {

    private Paint paint;
    public static final int WIDTH = 800;
    public static final int HEIGHT = WIDTH * 9/16;
    public boolean isPlaying = false;


    private Thread gameThread;

    private Ball ball;
    private Paddles paddle1;
    private Paddles paddle2;

    public void GamePlay() {


    }
    @FXML
    private AnchorPane gamePane;
    @FXML
    private Ball ballCircle;
    @FXML
    private Paddles paddle1Rec;
    @FXML
    private Paddles paddle2Rec;

    @FXML
    public void onKeyPressed(){

    }

    @FXML void onKeyReleased(){

    }

    private void initialize(){
        ballCircle = new Ball();  // new ball

        paddle1Rec = new Paddles(); // new paddles
        paddle2Rec = new Paddles();
    }


    @Override
    public void run() {
        // run the game on a timer


    }
    // ???
    private void draw(Canvas canvas){
        ballCircle.draw(canvas);
        paddle1Rec.draw(canvas);
        paddle2Rec.draw(canvas);


    }

    public void start(){
        gameThread = new Thread(this);
        gameThread.start();
        isPlaying = true;
    }

    public void end(){
        try {
            gameThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isPlaying = false;
    }
    public static int sign(double direction){
        if(direction <= 0)
            return -1;
        else
            return 1;
    }
}
