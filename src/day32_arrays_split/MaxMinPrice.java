package day32_arrays_split;

import java.util.Arrays;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        System.out.println("Shopping list : "+Arrays.toString(items));
        System.out.println("Item prices: "+Arrays.toString(prices));
        System.out.println("Item ID's : "+Arrays.toString(itemIDs));

        double maxPrice=prices[0];
        double minPrice=prices[0];
        int maxIdx =0;
        int minIdx = 0;

        for (int i = 0; i < items.length; i++) {
            if(prices[i]>maxPrice){
                maxPrice=prices[i];
                maxIdx=i;
            }

        }
        System.out.println("The most expensive item is : ");
        System.out.println(items[maxIdx] + "- $" + prices[maxIdx] + " - #" + itemIDs[maxIdx]);

        for (int i = 0; i < items.length; i++) {
            if(prices[i]<minPrice){
                minPrice=prices[i];
                minIdx=i;
            }

        }
        System.out.println("The cheapest item is : ");
        System.out.println(items[minIdx] + "- $" + prices[minIdx] + " - #" + itemIDs[minIdx]);

    }
}
