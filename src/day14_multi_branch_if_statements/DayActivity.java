package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "sunny";

        if(weather.equals("sunny")) {
            System.out.println("Go to park! Practice Soft Skills");
        } else if(weather.equals("snowy")) {
            System.out.println(" Stay warm,drink hot chocolate and study Java");
        } else if(weather.equals("rainy")) {
            System.out.println(" Stay home,drink tea and study Java");
        } else if(weather.equals("windy")) {
            System.out.println("Stay home and code Java!");
        } else {
            System.out.println("Keep coding Java!");
        }

    }
}
