package day41_arraylist;

import java.util.*;

public class CitiesList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("izmir");
        cities.add("Greer");
        cities.add("Sparta");
        cities.add("LA");
        cities.add(0,"Ashgabat");//adds thr element to the given index and remove the others to the next index
        cities.add("istanbul");

        System.out.println(cities);
        System.out.println("first city is "+cities.get(0));
        System.out.println("last city is "+cities.get(cities.size()-1));
        System.out.println("the count of items is "+ cities.size());

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i)+" ");

        }
        System.out.println();
        for(String city:cities){
            System.out.print(city+" ");
        }
        System.out.println();
        cities.remove(4);
        cities.remove("Sparta");
        System.out.println(cities);
        cities.clear();
        System.out.println(cities);

    }
}
