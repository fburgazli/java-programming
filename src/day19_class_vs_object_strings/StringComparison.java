package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {

        String city = "Greer";
        System.out.println(city.equals("Greer")); //True
        System.out.println(city.equals("GrEEr")); //False
        System.out.println(city.equals("GREER")); //False
        System.out.println(city.equals("Gre er")); //False
        System.out.println(city.equals("Greer1")); //False


        System.out.println(city.equalsIgnoreCase("GREER"));//true
        System.out.println(city.equalsIgnoreCase("GREEr"));//true
        System.out.println(city.equalsIgnoreCase("GReeer"));//false
        System.out.println(city.equalsIgnoreCase("GRE ER"));//false
        System.out.println(city.equalsIgnoreCase("greer"));//true


    }
}
