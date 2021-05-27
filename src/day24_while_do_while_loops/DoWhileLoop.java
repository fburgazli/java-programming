package day24_while_do_while_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int apples = 1;

        do{
            System.out.println("Eating an apple " + apples);
            apples++;

        } while(apples <= 10);
        System.out.println("No more apples!");

        int counter = 0;

        do{
            System.out.println("counter = " + counter);
            counter+=5;
        } while(counter <= 100);


    }
}
