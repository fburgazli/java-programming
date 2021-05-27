package office_hours.replit_practice;

import java.util.Scanner;

public class ShoppingList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        double totalPrice = 0;
        System.out.println("Enter Item1 and its price:");
        item =scan.next();
        price =scan.nextDouble();
        shoppingListReport += "Item1: "+item +" Price: "+price+", ";
        totalPrice +=  price;

        for(int i=2;i<11;i++){
            System.out.println("Add one more item?");
            countinue =scan.next();
            if(countinue.equalsIgnoreCase("yes")){
                System.out.println("Enter Item"+i+ " and its price:");
                item = scan.next();
                price = scan.nextDouble();
                shoppingListReport += "Item"+i+": "+item +" Price: "+price+", ";
                totalPrice +=  price;
            } else {
                System.out.println(shoppingListReport);
                System.out.println("Total price: " + totalPrice);
                return;

            }
        }




    }
}
