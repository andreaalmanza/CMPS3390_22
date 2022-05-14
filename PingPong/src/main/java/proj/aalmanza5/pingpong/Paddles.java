package proj.aalmanza5.pingpong;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

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
    public void onKeyPressed(KeyEvent e){
        paddle1Rec.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println(event.getCode());
                if (event.getCode()== KeyCode.UP) {
                    System.out.println("going up"); //
                }

            }
        });
    }
    @FXML
    public void onKeyReleased(KeyEvent e){
        paddle1Rec.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println(event.getCode());
                if (event.getCode()== KeyCode.UP) {
                    System.out.println("going up released"); //
                }

            }
        });
    }

    public void changeDirection(int direction){
        int vel = speed * direction;
    }

    public void update(Ball ball){


    }

    public void draw(){
        Rectangle paddle1 = this.paddle1Rec;
        Rectangle paddle2 = this.paddle2Rec;
    }
}
