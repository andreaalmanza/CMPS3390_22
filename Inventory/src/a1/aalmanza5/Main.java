package a1.aalmanza5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Random ran = new Random();

    private static final FoodItems[] foodItems = FoodItems.values();
    private static final Tools[] tools = Tools.values();
    private static final ToolUses[] toolUses = ToolUses.values();
    private static final OutfitItems[] outfitItems = OutfitItems.values();
    private static final CoolFit[] coolFits = CoolFit.values();
    private static final CarItems[] carItems = CarItems.values();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Item> items = new ArrayList<>();

        System.out.print("HOw many items do you want: ");
	    int itemCnt = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < itemCnt; i++){
            int type = ran.nextInt(4);
            switch (type) {
                case 0 -> items.add(genFood());

                case 1 -> items.add(genTool());



                case 2 -> items.add(genOutfit());



                case 3 -> items.add(genCars());

            }

        }

        for(Item i : items){
            System.out.println(i);
        }




    }




    public static Food genFood() {
        int foodIndex = ran.nextInt(foodItems.length);
        String foodName = foodItems[foodIndex].toString();
        float foodPrice = ran.nextFloat(10);
        int foodQty = ran.nextInt(30);
        int foodUses = ran.nextInt(6);
        float healthGain = ran.nextFloat(20);
        return new Food(foodName, foodPrice, foodQty, foodUses, healthGain);
        //System.out.println(c);
        //items.add(tmpFood);

    }
    public static Tool genTool() {
        int toolIndex = ran.nextInt(tools.length);
        String toolName = tools[toolIndex].toString();
        float toolPrice = ran.nextFloat(200);
        int toolQty = ran.nextInt(15);
        String use = toolUses[toolIndex].toString();
        return new Tool(toolName, toolPrice, toolQty, use);

    }

    public static Outfit genOutfit() {
        int outfitIndex = ran.nextInt(outfitItems.length);
        String fitName = outfitItems[outfitIndex].toString();
        float fitPrice = ran.nextFloat(100);
        int fitQty = ran.nextInt(200);
        String wears = coolFits[outfitIndex].toString();
        return new Outfit(fitName, fitPrice, fitQty, wears);

    }

    public static Cars genCars() {
        int carIndex = ran.nextInt(carItems.length);
        String carName = carItems[carIndex].toString();
        float carPrice = ran.nextFloat(10000);
        int carQty = ran.nextInt(30);
        float fast = ran.nextFloat(500);
        return new Cars(carName, carPrice, carQty, fast);

    }
}
