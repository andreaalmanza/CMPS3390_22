package a2.aalmanza5;

import a1.aalmanza5.Item;

import java.util.Random;

public class ThreadSort extends Thread{
    private Item[] tItems;

    public ThreadSort(Item[] items, int lowBounds, int upperBounds){
        this.tItems = new Item[upperBounds - lowBounds];

        System.arraycopy(items, lowBounds, this.tItems, 0, (upperBounds - lowBounds));  //memory copy
    }

    @Override
    public void run() {
        System.out.println("Thread Started");
        int n = this.tItems.length;
        Item tmp;
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                if(this.tItems[j-1].getPrice() > this.tItems[j].getPrice()){ //if item before is more $$ swap them
                    tmp = this.tItems[j-1];
                    this.tItems[j-1] = this.tItems[j];
                    this.tItems[j-1] = this.tItems[j];
                    this.tItems[j] = tmp;
                }
            }
        }
        System.out.println("Thread is complete");
    }

    public Item[] gettItems() {
        return tItems;
    }
}
