package day13_conditional_statements2;

import sun.lwawt.macosx.CSystemTray;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;

        if(isHungry){
            System.out.println("Get something to eat.");
            System.out.println("Then code java!");
        } else {
            System.out.println("Get some tea and keep coding Java!");
        }

        double price = 130.44;
        double balance = 200.0;
        boolean isAffordable = balance >= price;

        if(isAffordable) {
            System.out.println("You can afford to to buy this item.");
        } else {
            System.out.println("You can't afford to buy this item.");
        }

        boolean isRemoteJob = true;

        if(!isRemoteJob) {
            System.out.println("Sorry I am not interested.");
        } else {
            System.out.println("Sure, I am interested.What is the interview process?");
        }


    }
}
