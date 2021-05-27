package day18_conditions_practice;

public class Authenticaation {
    public static void main(String[] args) {
        int last4SSN = 1234;
        int pinCode = 2456;
        int expLastSSN= 9874;
        int expPinCode = 2456;
        if( pinCode == expPinCode) {
            if(last4SSN == expLastSSN){
                System.out.println("Authenticated");
            } else {
                System.out.println("SSN did not match.");
            }
        } else {
            System.out.println("Pin code did not match.");
        }


        /* Todo : Check this out! Murodil's code here!
            if (last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication successful");
            }else {
            System.out.println("Authentication unsuccessful");
            if(last4SSN != expLast4SSN) {
                System.out.println("Last 4 SSN number is incorrect");
            }
            if (expPinCode != pinCode) {
                System.out.println("Pin Code is incorrect");
            }
         */
    }
}
