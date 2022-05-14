package proj.aalmanza5.pingpong;

import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Paddles extends GamePlay{
    private int x, y;
    private int speed = 0;
    private int width = 20, height = 70;
    @FXML
    private Rectangle paddle1Rec;
    @FXML
    private Rectangle paddle2Rec;

   // private boolean left, right;
    private int score = 0;

    public Paddles() {
    }
    public void scoredPoint(){
        score++;
    }
    @FXML
    public void onKeyPressed(KeyEvent e){}
    @FXML
    public void onKeyReleased(KeyEvent e){}

    public void changeDirection(int direction){
        int vel = speed * direction;
    }

    public void update(Ball ball){
        //update position

        // collisions

    }

    public void draw(Canvas canvas){
        Rectangle paddle1 = this.paddle1Rec;
        Rectangle paddle2 = this.paddle2Rec;
    }
}
