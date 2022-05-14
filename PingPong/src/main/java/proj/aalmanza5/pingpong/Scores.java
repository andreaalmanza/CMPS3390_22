package proj.aalmanza5.pingpong;

import java.net.http.HttpClient;

// scores going into firebase
public class Scores extends Paddles{
    private static final HttpClient client = HttpClient.newBuilder().build();
    private static final String baseURL = "https://pingpong-16a1c-default-rtdb.firebaseio.com";

    private static final String apiKey = "AIzaSyDnPfMSv9ydAVGjBIvtjBS6_coIC4VovZQ";

    public static void addScore(Paddles paddle1Rec, Paddles paddle2Rec){}
    public static void getScore(){}
}
