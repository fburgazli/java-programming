package day33_arrays;

public class PasswordRegex {
    /*
    The password policy is:
    At least 8 chars
    Contains at least one digit
    Contains at least one lower alpha char and one upper alpha char
    Contains at least one char within a set of special chars (@#%$^ etc.
    Does not contain space, tab, etc.
     */
    public static void main(String[] args) {
        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
