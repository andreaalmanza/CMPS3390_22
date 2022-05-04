package proj.aalmanza5.pingpong;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

//import static java.awt.Color.white;

public class Ball {
    public static int SIZE = 16;
    private Color color;

    private int x, y;
    private int xVelocity, yVelocity;
    private int speed = 5;

    public Ball() {
        reset();
    }

    private void reset() {
        // reset ball for new game
        x = GamePlay.WIDTH / 2 - SIZE / 2;
        y = GamePlay.HEIGHT / 2 - SIZE / 2;

        // starting velocity
        // should they get faster as the timer keeps going?
        xVelocity = GamePlay.sign(Math.random() * 2.0 - 1);
        yVelocity = GamePlay.sign(Math.random() * 2.0 - 1);

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setXDirection(){
        xVelocity *= -1;
    }

    public void setYDirection(){
        yVelocity *= -1;
    }



    public void draw(Canvas canvas){
        //canvas.Color(color.white);
       // color(white);

    }

    //private void color(java.awt.Color white) {
    //}

    public void update(Paddles paddle1, Paddles paddle2){
        x += xVelocity * speed;
        y += yVelocity * speed;

        // At collision
        if (y + SIZE >= GamePlay.HEIGHT || y <= 0)
            setYDirection(); // change the direction at collision
        if(x + SIZE >= GamePlay.WIDTH){
            paddle1.scoredPoint();
            reset();
        }
        if (x <= 0) {
            paddle2.scoredPoint();
            reset();
        }

    }

}
