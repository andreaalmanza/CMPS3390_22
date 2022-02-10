package a1.aalmanza5;

public class Cars extends Item{
    private float fast;

    public Cars() {
        super();
        this.fast = 0;
    }

    public Cars(String name, double price, int qty, float fast) {
        super(name, price, qty);
        this.fast = 0;
    }

    public float getFast() {
        return fast;
    }

    public void setFast(float fast) {
        this.fast = fast;
    }
    @Override
    public String toString() {
        return String.format("%s %20.2f |", super.toString(), this.fast);
    }
}
