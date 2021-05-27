package day45_OOP;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println(myCoffee.getAmount());
        myCoffee.refill();
        System.out.println(myCoffee.getAmount());
        myCoffee.drink(40);
        System.out.println(myCoffee.getAmount());

        myCoffee.setType("Turkish Coffee");

        System.out.println(myCoffee.getType());
        System.out.println(myCoffee.toString());

        Coffee coffee2 = myCoffee;
        coffee2.setType("latte");
        System.out.println(myCoffee.getType());
        System.out.println(coffee2.getType());

        Coffee coffee3 = coffee2;
        coffee3.setType("frappucino");
        System.out.println(coffee3.getType());
        System.out.println(coffee2.getType());

        Coffee coffee4 = null;
        coffee4.setType("turkish");
    }

}
