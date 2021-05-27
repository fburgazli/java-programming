package day15_logicalops_switch_ternary;

public class CarDealer {
    public static void main(String[] args) {
        double budget = 10_000.0;
        String car = "Honda";
        double carPrice = 9_999.0;
        if((car.equals("Toyota") ||car.equals("Honda") || car.equals("Tesla")) && carPrice <= budget){
            System.out.println("You can buy a " + car + " within your budget with $" + carPrice );

        } else {
            System.out.println("Sorry! We dont have any car in this budget!");
        }
    }
}
