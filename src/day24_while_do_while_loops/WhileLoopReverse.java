package day24_while_do_while_loops;

import java.util.SortedMap;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;
        while(count >= 0){
            System.out.println("count = " + count);
            count--;
        }
        System.out.println("finished the count.");

        int unreadSMS =10;
        System.out.println("You have " + unreadSMS + " \uD83D\uDC8C unread messages.");
        while(unreadSMS > 0){
            System.out.println("You have " + unreadSMS + " left.");
            unreadSMS--;
        }
        System.out.println("You have no unread SMS now.");
    }
}
