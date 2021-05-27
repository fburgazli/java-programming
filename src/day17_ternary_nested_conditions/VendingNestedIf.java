package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drink = "tea";
        String snack = "chips";

        if(selection.equals("drink")){
            System.out.println("Drink option is selected");
            if(drink.equals("tea")){
                System.out.println("Tea is selected");
            }else {
                System.out.println("Coke is selected");
            }

        } else if(selection.equals("snack")){
            System.out.println("Snack option is selected.");
            if(snack.equals("chips")){
                System.out.println("Chips is selected");
            }else{
                System.out.println("Candy is selected");
            }
        } else {
            System.out.println("Invalid selection!");
        }
    }
}
