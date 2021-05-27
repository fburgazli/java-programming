package office_hours.saim_only_tasks;

public class CoolName {
    /*
    Declare a variable name. You will check if it is a cool name.
    - If the name begins with an ‘a’ or a ‘z’ print “Your name is cool”
    - If the name ends with 'm' print "Almost cool"
    - Otherwise print “Sorry not a cool name”
     */
    public static void main(String[] args) {
        String name = "Fikret";
        if(name.toLowerCase().startsWith("a") || name.toLowerCase().startsWith("z")){
            System.out.println("Your name is cool!");
        } else if (name.toLowerCase().endsWith("m")){
            System.out.println("Almost cool");
        } else {
            System.out.println("Sorry not a cool name");
        }

    }
}
