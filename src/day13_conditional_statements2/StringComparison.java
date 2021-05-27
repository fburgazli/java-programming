package day13_conditional_statements2;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Greer";
        if(city.equals("Greer")) {
            System.out.println("It is Greer");
        } else {
            System.out.println("It is not Greer");
        }

        String weather = "sunny";

        if(weather.equals("sunny")) {
            System.out.println("Let's go outside and code Java!");
        } else{
            System.out.println("Let's stay at home and code Java!");
        }
    }
}
