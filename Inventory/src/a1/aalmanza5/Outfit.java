package a1.aalmanza5;

public class Outfit extends Item{
    private String wears;

    public Outfit() {
        super();
        this.wears = "";
    }

    public Outfit(String name, double price, int qty, String wears) {
        super(name, price, qty);
        this.wears = wears;
    }

    public String getWears() {
        return wears;
    }

    public void setWears(String wears) {
        this.wears = wears;
    }

    @Override
    public String toString(){
        return String.format("%s %7s %-20s |", super.toString(), "|",  this.wears);
    }
}
