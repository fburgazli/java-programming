package office_hours.saim_only_tasks;

public class LowerUpperCase {
    public static void main(String[] args) {
        char letter = '?';

        if ( letter >= 'a' && letter <= 'z' ) {
            System.out.println(letter + " is lowercase.");
        } else if(letter >= 'A' && letter <= 'Z'){
            System.out.println(letter + " is UPPERCASE");
        } else {
            System.out.println("Invalid entry");
        }


    }
}
