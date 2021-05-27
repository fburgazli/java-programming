package day46_encapsulation;

public class CheckingAccount {
    private double balance;
    private long accountNumber;
    private String accountHolder;
    private String accountType = "Checking";

    public double getBalance() {
        return balance;
    }
    public void setAccountInfo(long accountNumber,String accountHolder,double balance,String accountType){
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        setBalance(balance);
        setAccountType(accountType);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
