package a2.aalmanza5;

import a1.aalmanza5.Item;

public class MergeSort extends Thread{
    private final Item[] item1;
    private final Item[] item2;
    //private final Item[] item3;
    //private final Item[] item4;
    private final Item[] sortedItems;

    public MergeSort(Item[] i1, Item[] i2){
        this.item1 = i1;
        this.item2 = i2;
        //this.item3 = i3;
        //this.item4 = i4;
        this.sortedItems = new Item[i1.length + i2.length];
    }

    @Override
    public void run() {
        System.out.println("Merge Started");
        int i=0; // Current index of item1
        int j=0; // Current index of item2
        int k=0; // Current index of sortedItems

        while(i < item1.length && j < item2.length){
            if(this.item1[i].getPrice() < this.item2[j].getPrice()){
                this.sortedItems[k++] = this.item1[i++];
            } else {
                this.sortedItems[k++] = this.item2[j++];
            }
        }

        while(i < this.item1.length){
            this.sortedItems[k++] = this.item1[i++];
        }
        while (j < this.item2.length){
            this.sortedItems[k++] = this.item2[j++];
        }

        System.out.println("Merge Complete");
    }

    public Item[] getSortedItems() {
        return sortedItems;
    }
}
