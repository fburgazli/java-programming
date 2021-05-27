package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();

        account.setAccountHolder("James Bond");
        account.setAccountNumber(10000214567L);
        account.setAccountType("Saving");
        account.setBalance(500_000.50);
        System.out.println(account);

        CheckingAccount account1 = new CheckingAccount();
        account1.setAccountInfo(100034239897L,"Nadia Johnson", 4500.45, "Checking");
        System.out.println(account1);

    }
}
