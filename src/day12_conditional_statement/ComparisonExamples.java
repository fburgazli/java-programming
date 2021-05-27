package day12_conditional_statement;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding : " + isSpeeding);

        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("isSpeeding = " + isSpeeding);

        double accountBalance = 250.25;
        double itemPrice = 200.99 ;
        boolean canAfford = itemPrice <= accountBalance;
        System.out.println("Can I afford? - "+ canAfford);

        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("isBroke = " + isBroke);



    }
}
