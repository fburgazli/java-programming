package office_hours.practice031021;

import java.util.Scanner;

public class MovieDuration {
    /*
    [Movie duration]

The length of the movie will determine how much it costs.
Use a Scanner object to read the input from the user for how long the movie is and print
out how much the movie will cost.
The length will be given as a decimal as hours.minutes
> 1.0 - 8.99
> 1.5 - 10.50
> 2.0 - 12.99
> 2.5 - 14.50
-> 3 or more - 15.99
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter movie's duration: ");
        double duration = scan.nextDouble();
        double price = 0;

        if(duration <= 0){
            System.out.println("Invalid Value");
        } else {

            if (duration <= 1) {
                price = 8.99;
            } else if (duration <= 1.5) {
                price = 10.50;
            } else if (duration <= 2) {
                price = 12.99;
            } else if (duration <= 2.5) {
                price = 14.50;
            } else if (duration >= 3.0) {
                price = 15.99;
            }
            System.out.println("Ticket price = $" + price);

        }

    }
}
