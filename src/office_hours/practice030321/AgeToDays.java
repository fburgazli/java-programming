package office_hours.practice030321;

public class AgeToDays {
    /*
    Concatination, Arithmetic operators,
================================================

Make a class AgeToDays
create a main method

    - Declare two int variables: age and age in days

    - Use a base of 365 days in a year

    - Calculate and display:
        You are $age years old! That means you are $days days old
     */
    public static void main(String[] args) {
        int age = 42;
        int ageInDays = age * 365;
        System.out.println("You are " + age + " years old! That means you are " + ageInDays + " days old.");
    }

}
