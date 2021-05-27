package office_hours.practice031521;

public class ReplitTest {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        String input = "Pants";
        int balance = 100;

        if (input.equals("Blanket") || input.equals("Charger") ||
                input.equals("Hat") || input.equals("Headphones") ||
                input.equals("Pants") || input.equals("Pillow") ||
                input.equals("Socks") || input.equals("USB cable")) {
            if (input.equals("Blanket")) {
                balance -= 60;
            } else if (input.equals("Charger")) {
                balance -= 15;
            } else if (input.equals("Hat")) {
                balance -= 25;
            } else if (input.equals("Headphones")) {
                balance -= 30;
            } else if (input.equals("Pants")) {
                balance -= 50;
            } else if (input.equals("Pillow")) {
                balance -= 40;
            } else if (input.equals("Socks")) {
                balance -= 5;
            } else if (input.equals("USB cable")) {
                balance -= 10;
            }
            System.out.println("Thank you for your purchase! ");
            System.out.print("Your current balance is: " + balance + "$");
        } else if (input.equals("Laptop") || input.equals("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else {
            System.out.println("Invalid item!");
        }
    }
}
