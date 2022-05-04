package proj.aalmanza5.pingpong;

import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Paddles {
    private int x, y;
    private int speed = 0;
    private int width = 20, height = 70;
    private Color color;

    private boolean left, right;
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

    public void draw(Canvas canvas){}
}
