package office_hours.replit_practice;

import java.util.Scanner;

public class ShoppingList2WithWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "yes";
        double price = 0;
        double totalPrice = 0;


            int i =1;

            while (countinue.equalsIgnoreCase("yes")) {
                System.out.println("Enter Item" + i + " and its price:");
                item = scan.next();
                price = scan.nextDouble();
                shoppingListReport += "Item" + i + ": " + item + " Price: " + price + ", ";
                totalPrice += price;
                System.out.println("Add one more item?");
                countinue = scan.next();
                i++;
            }
        System.out.println(shoppingListReport);
        System.out.println("Total price: " + totalPrice);
        }
}

