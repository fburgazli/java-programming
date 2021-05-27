package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,4,25,3);

        nums.forEach(n -> {
            if(n%2==0){
                System.out.println(n*n);
            }
        });

        System.out.println(nums);
        //nums.add(100); .UnsupportedOperationException
        //nums.remove(0) ; .UnsupportedOperationException
       // nums.clear() .UnsupportedOperationException
        // some methods will work and some not because size can not be changed.

        // Solution is:if you declare as new ArrayList,you can use all methods.
        List<String> cities= new ArrayList<>(Arrays.asList("Greer","Sparta","Greenville","Easley"));
        System.out.println(cities);
        cities.add("Clemson");
        System.out.println(cities);
        cities.set(0,"Simpsonville");
        System.out.println(cities);
        cities.remove(4);
        System.out.println(cities);
        cities.remove(new String("Sparta"));
        System.out.println(cities);

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee","tea","monster","redbull","coke","pepsi","mdew","kambucha","celcius"));
        int caffeinAmoount =0;
        System.out.println(drinksWithCaffeine);
        drinksWithCaffeine.forEach(drink -> System.out.print(drink+"*"));
        System.out.println();
        for (String drink: drinksWithCaffeine){
            switch (drink){
                case "monster": case "redbull": case "celcius":
                    caffeinAmoount = 150;
                    break;
                case "coffee": case "kambucha":
                    caffeinAmoount =112;
                    break;
                case "tea": case "coke": case "pepsi":
                    caffeinAmoount = 35;
                    break;
            }
            System.out.println(drink+ " = " + caffeinAmoount);
        }
        //drinksWithCaffeine.forEach(drink -> {code blocks for each element});
        // -> is Lambda expression
        drinksWithCaffeine.forEach(drink -> {
            System.out.println("----------");
            System.out.println(drink);
            System.out.println("+++++++++++");
        });


    }
}
