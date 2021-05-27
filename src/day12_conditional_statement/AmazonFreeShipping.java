package day12_conditional_statement;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price: ");
        double totalPrice = scan.nextDouble();
        if(totalPrice>= 25.0){
            System.out.println("Free shipping eligible.Your order total is $" +totalPrice);
        } else {
            System.out.println("Not eligible for free shipping.Your order total is $" +totalPrice +" which less than $25.00");
        }
        System.out.println("THANKS FOR SHOPPING AT AMAZON");
    }
}
