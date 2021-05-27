package day32_arrays_split;

import java.util.Arrays;
import java.util.Random;

public class ShoppingItems {
    public static void main(String[] args) {
        Random random =new Random();
        //todo:shuffle the items in array by using random class;
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("-------------Find the first index of 'Gloves' in items array--------");
        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("Gloves")){
                System.out.println("Gloves found at index = " +i);
                break;
            }
        }
        boolean isFound = false;
        for (String item:items) {
            if(item.equalsIgnoreCase("iPad")){
                isFound = true;
                break;
            }
        }
        System.out.println("Item found = "+ isFound);

        System.out.println("------Print a report of each item in shopping list------");

        for (int i = 0; i < items.length; i++) {
            System.out.println(i+1+". "+items[i] +"\t-\t$"+prices[i] +"\t-\t#"+ itemIDs[i]);

        }
        System.out.println("------Look for jacket and print all details--------");
        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("jacket")) {
                System.out.println(items[i] + "\t-\t$" + prices[i] + "\t-\t#" + itemIDs[i]);
                break;
            }

        }




    }
}
