package day13_conditional_statements2;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0;
        double salesAmaount = 2000.55;
        if (salesAmaount <= 1000) {
            System.out.println("Good job, you are qualified for a bonus!");
            bonus = 50;
        } else {
            System.out.println("Great job, you are qualified for full bonus!");
            bonus = 100;
        }
        System.out.println("Your bonus for " + salesAmaount + " is $" + bonus);
    }
}
