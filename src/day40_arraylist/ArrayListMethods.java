package day40_arraylist;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println(shoppingList.isEmpty());
        System.out.println(shoppingList.size());
        if(shoppingList.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List is not empty.");
        }

        shoppingList.add("shoes");
        shoppingList.add("monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List is not empty.");
        }

        int count = shoppingList.size();
        System.out.println("count = " + count);
        System.out.println("is shoes in my list? - " + shoppingList.contains("shoes"));

        if(shoppingList.contains("shoes")){
            System.out.println("Don't forget to buy shoes.");
        } else{
            System.out.println("Add shoes to your list!");
        }

        shoppingList.remove(0);
        System.out.println(shoppingList);
        System.out.println("Done shopping,get back home!");
        shoppingList.clear();
        System.out.println(shoppingList);


    }
}
