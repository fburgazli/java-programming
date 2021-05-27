package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Tampa,FL";

        if (city.equals("Tampa,FL") || city.equals("Greenville,SC")) {
            System.out.println("I'd love to live in " + city);
        } else {
            System.out.println("I don't like to relocate to " + city);
        }

        String teacher = "Nadir";

        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("Java Programming class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skills class with " + teacher);
        } else {
            System.out.println("Wrong teacher name!");
        }

        String company ="Kroger";
        double salary = 100_000.0;
        if(company.equals("Apple") || salary >= 100_000){
            System.out.println("Accept offer");
        } else {
            System.out.println("Negotiate!");
        }
    }
}
