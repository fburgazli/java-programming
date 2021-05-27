package day23_string_manipulation4;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {

        String word = "woo den sp oon";
        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.replace(" ","").toUpperCase());

        String city = "ISTANBUL";
        //city = city.toUpperCase().charAt(0)+ city.substring(1);
        city = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println("city = " + city);
    }
}
