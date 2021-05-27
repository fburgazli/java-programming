package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.44;
        System.out.println("balance = $" + balance);

        double baklava = 22.50;
        System.out.println("baklava = $" + baklava);

        balance = balance - baklava;
        System.out.println("balance after baklava = $" + balance);

        double kunefe = 44.45;
        System.out.println("kunefe = $" + kunefe);
        balance = balance - kunefe;
        System.out.println("balance after kunefe = $" + balance);

        kunefe = kunefe /2;
        balance=  balance - kunefe;
        System.out.println("balance after 2nd kunefe = $"+ balance);

        double kaymak = 7.99;
        balance = balance - kaymak;
        System.out.println("balance after kaymak = $" + balance);

        double tea = 2.99;
        balance = balance - tea*5;
        System.out.println("balance after 5 tea = $" + balance);

        balance = balance + baklava; // because of kunefe canceling baklava
        System.out.println("balance after returning baklava = $" + balance);



    }
}
