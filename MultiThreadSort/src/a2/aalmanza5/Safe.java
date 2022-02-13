package a2.aalmanza5;

public class Safe extends Thread{
    private static int count;

    @Override
    public void run() {
        try {
            sleep((long) (Math.random() * 100));
            getCount();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static synchronized int getCount() {
        // synchronized is key to safety; "dont let another thread come in until 1st thread to access has finished.
        // thread comes in locks door behind them and when they leave they unlock the door
        System.out.println(count);
        return count++;
    }
}
