package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "grande";
        double price = 0;
        int cal = 0;

        switch (size) {
            case "tall":
                System.out.println("Tall Cappuccino please");
                price = 3.69;
                cal = 90;
                break;
            case "grande":
                System.out.println("Grande Cappuccino please");
                price = 3.99;
                cal = 120;
                break;
            case "venti":
                System.out.println("Venti Cappuccino please");
                price = 4.29;
                cal = 150;
                break;
            default:
                System.out.println("We don't serve that size of Cappuccino");
        }

        System.out.println("Price = $" + price);
        System.out.println("Calories = " + cal + " calories");

    }
}
