package a1.aalmanza5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        List<Item> items = new ArrayList<>();
        FoodItems[] foodItems = FoodItems.values();
        Tools[] tools = Tools.values();
        ToolUses[] toolUses = ToolUses.values();
        OutfitItems[] outfitItems = OutfitItems.values();
        CoolFit[] coolFits = CoolFit.values();
        CarItems[] carItems = CarItems.values();
        System.out.print("HOw many items do you want: ");
	    int itemCnt = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < itemCnt; i++){
            int type = ran.nextInt(2);
            switch (type) {
                case 0 -> {
                    int foodIndex = ran.nextInt(foodItems.length);
                    String foodName = foodItems[foodIndex].toString();
                    float foodPrice = ran.nextFloat(10);
                    int foodQty = ran.nextInt(30);
                    int foodUses = ran.nextInt(6);
                    float healthGain = ran.nextFloat(20);
                    Food tmpFood = new Food(foodName, foodPrice, foodQty, foodUses, healthGain);
                    //System.out.println(c);
                    items.add(tmpFood);
                }
                case 1 -> {
                    int toolIndex = ran.nextInt(tools.length);
                    String toolName = tools[toolIndex].toString();
                    float toolPrice = ran.nextFloat(200);
                    int toolQty = ran.nextInt(15);
                    String use = toolUses[toolIndex].toString();
                    Tool tmpTool = new Tool(toolName, toolPrice, toolQty, use);
                    //System.out.println(tmp);
                    items.add(tmpTool);

                    int outfitIndex = ran.nextInt(outfitItems.length);
                    String fitName = outfitItems[outfitIndex].toString();
                    float fitPrice = ran.nextFloat(100);
                    int fitQty = ran.nextInt(200);
                    String wears = coolFits[outfitIndex].toString();
                    Outfit tmpOutfit = new Outfit(fitName, fitPrice, fitQty, wears);
                    items.add(tmpOutfit);

                    int carIndex = ran.nextInt(carItems.length);
                    String carName = carItems[carIndex].toString();
                    float carPrice = ran.nextFloat(10000);
                    int carQty = ran.nextInt(30);
                    float fast = ran.nextFloat(500);
                    Cars tmpCars = new Cars(carName, carPrice, carQty, fast);
                    //System.out.println(c);
                    items.add(tmpCars);
                }
                case 2 -> {
                    int outfitIndex = ran.nextInt(outfitItems.length);
                    String fitName = outfitItems[outfitIndex].toString();
                    float fitPrice = ran.nextFloat(100);
                    int fitQty = ran.nextInt(200);
                    String wears = coolFits[outfitIndex].toString();
                    Outfit tmpOutfit = new Outfit(fitName, fitPrice, fitQty, wears);
                    items.add(tmpOutfit);
                }
                case 3 -> {
                    int carIndex = ran.nextInt(carItems.length);
                    String carName = carItems[carIndex].toString();
                    float carPrice = ran.nextFloat(10000);
                    int carQty = ran.nextInt(30);
                    float fast = ran.nextFloat(500);
                    Cars tmpCars = new Cars(carName, carPrice, carQty, fast);
                    //System.out.println(c);
                    items.add(tmpCars);
                }
            }

        }

        for(Item i : items){
            System.out.println(i);
        }




    }
}
