package office_hours.saim_only_tasks.loops_practice_1;
import java.util.*;
public class DynamicAlphabet {
    /*
    [Dynamic alphabet]
• Write a program that will ask ‘upper’ or ‘lower’
• If it is upper: print the alphabet in all uppercase letter from A to Z • If it is lower: print the alphabet in all uppercase letter from a to z
- Challenge: Also ask if they want to show the alphabet in ascending or order descending
- Ascending:A–Z o ra–z
- Descending:Z–A or z–a
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want your alphabet \"Uppercase\" or \"Lowercase\".\nPlease enter \"U\" for \"Uppercase\" and \"L\" for \"Lowercase\"");
        String upperOrLower = scan.next();
        System.out.println("Do you want your alphabet in \"Ascending\" or \"Descending\" order.\nPlease enter 'A' for \"Ascending\" and 'D' for \"Descending\"" );
        String order = scan.next();
        char letter = 'a';
        if(upperOrLower.equalsIgnoreCase("l")){
            if(order.equalsIgnoreCase("a")){
                letter ='a';
                while(letter <= 'z')  {
                    System.out.print(letter + " ");
                    letter++;
                }
            }else{
                letter = 'z';
                while(letter >= 'a')  {
                    System.out.print(letter + " ");
                    letter--;
                }

            }
        }else if(upperOrLower.equalsIgnoreCase("u")){
            if(order.equalsIgnoreCase("a")){
                letter ='A';
                while(letter <= 'Z')  {
                    System.out.print(letter + " ");
                    letter++;
                }
            } else {
                letter = 'Z';
                while (letter >= 'A') {
                    System.out.print(letter + " ");
                    letter--;
                }
            }

        }


    }

}
