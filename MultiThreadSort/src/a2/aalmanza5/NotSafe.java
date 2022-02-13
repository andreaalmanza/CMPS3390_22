package a2.aalmanza5;

public class NotSafe extends Thread{
    public static int count;    //static- can use variable w/o instantiating a class of NotSafe

    @Override
    public void run() {
        try {
            sleep((long) (Math.random() * 100));
            getCount();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int getCount() {
        System.out.println(count);
        return count++;
    }
}
