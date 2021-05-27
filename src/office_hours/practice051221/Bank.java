package office_hours.practice051221;

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();

        bankAccount1.accountHolderName = "John Smith";
        bankAccount1.pin = 1234;
        bankAccount1.balance = 54300.50;
        bankAccount1.accountNumber = 213456700002L;
        System.out.println(bankAccount1.getBalance(1834));

        System.out.println(new BankAccount().accountHolderName); //null because new object created
    }
}
