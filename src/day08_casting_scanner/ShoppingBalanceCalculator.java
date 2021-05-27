package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;
        double price1 = 20.88,
                price2 = 89.99,
                price3 = 15.00;
        double sumSpent= price1 + price2 + price3;
        double remainingBalance = balance-sumSpent;

        System.out.println("Your initial balance: $" + balance);
        System.out.println("Your remaining balance is: $" + remainingBalance);

        int balanceWithoutCents = (int) remainingBalance;
        System.out.println("Your remaining balance is without cents: $" + balanceWithoutCents);

    }
}
