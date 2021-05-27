package office_hours.saim_only_tasks;

import java.util.Scanner;

public class FullNameLastName {
    public static void main(String[] args) {
        /*
        iven two String variables. One is a full name and the second a last name. Check if the full name has the same last name as the other String.
    Ex:
        s: "james bond"
        s: "bond"
        output: Same last name

        s: "alex benji"
        s: "bond"
        output: Not the same last name
         */

        String fullName = "James Bond";
        String lastName = "Bond";
        //fullName = "Alex Benji";
        if(fullName.endsWith(lastName)){ //contains(lastName) works too.
            System.out.println("Same last name");
        } else {
            System.out.println("Not the same last name");
        }

        /*
        Given a String variable with a message. You will check if the message contains any of these bad words: “idiot, dumb, heck”
    -> If the message contains any of those words print: “Message not sent”.
    -> If the message is bad word free print “Message sent”

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your text message:");
        String message = scan.nextLine();

        if(message.toLowerCase().contains("idiot") ||
                message.toLowerCase().contains("dumb") ||
                message.toLowerCase().contains("heck")) {
            System.out.println("Message not sent!");
        } else {
            System.out.println("Message sent.");
        }

        /*
        A person will enter their address into a String. Make sure the String is not empty.
    If it is empty print: "No address found".
    If there is an address make all the text uppercase to match the expected format

        Ex:
            Input: 231332 leaf ave, lake city 3132
            Output: 231332 LEAD AVE, LAKE CITY 3132

        Ex:
            Input: ""
            Output: No address found
         */


        System.out.println("Enter your address:");
        String address = scan.nextLine();

        if(address.isEmpty()){
            System.out.println("No address found");
        } else {
            System.out.println(address.toUpperCase());
        }

        /*
        Given a username and password verify they are valid.
    - The password cannot be less than 5 characters
        -> If it is less print: "Password cannot be less than 5 characters"
        -> If it is more then or equal to 5 print: "Valid password"

    - Also the password should not contain the username
        - If the password has the username in it print:
            "Invalid password, username should not be in it"
            Todo-> Also change the password to have the value: "password" ???

         */
        System.out.println("Enter your username:");
        String username = scan.next();
        System.out.println("Enter your password:");
        String password = scan.next();

        if(password.length()<5){
            System.out.println("Password cannot be less than 5 characters");
        } else {
            if(password.contains(username)){
                System.out.println("Invalid password, username should not be in it");
            } else {
                System.out.println("Valid password.");
                password.replace(password, "password");
            }
        }



    }
}
