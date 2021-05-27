package office_hours.saim_only_tasks;

import java.util.Scanner;

public class Ternary {
    /*
    [Eligible to get Loan]

Given two values: yearly salary and credit score determine if you can get a loan.

    To be approve for the loan, print: "Loan Approved":
        Salary: above 60,000
        Credit Score: above 650
    Otherwise print: "Loan Denied"

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your annual salary: $");
        int salary = scan.nextInt();
        System.out.println("Please enter your credit score:");
        int creditScore = scan.nextInt();

        String result = (salary>= 60_000 && creditScore >= 650) ? "Loan Approved" : "Loan Denied";

        System.out.println(result);

        /*
        [Sport]

        Given a sport you play at the community center you will have to pay some entrance fee.

            Soccer or Tennis fee is: 100
            Otherwise fee is: 50
         */
        String sport = "Soccer";

        int fee = sport.equals("Soccer") || sport.equals("Tennis") ? 100 : 50 ;

        System.out.println("Entrance Fee for " + sport + " = $" + fee);
    }
}
