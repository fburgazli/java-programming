package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    /*
    !true = false
    !false =true
     */
    public static void main(String[] args) {
        int apples = 5;
        System.out.println(!(apples > 2)); // false
        System.out.println(!(apples < 3)); // true

        int age = 2;
        // !(false) = true when age is 2
        if( !(age>7)){
            System.out.println("Need a car seat");
        } else {
            System.out.println("No need car seat");
        }

        boolean isSmokingAllowed = false;
        if(!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here!");
        } else {
            System.out.println("You can smoke here!");
        }

        String testEnv = "qa";
        if(!testEnv.equals("qa")) {
            System.out.println("In wrong environment for qa testing");
        }

        String secretPass = "abc123";
        String inputPass = "abc321";
        if(!secretPass.equals(inputPass)){
            System.out.println("Incorrect Password");
        }



    }
}
