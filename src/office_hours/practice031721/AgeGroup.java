package office_hours.practice031721;

public class AgeGroup {
    public static void main(String[] args) {
        /*
        Write a program that can define the age groups of a person.

        Have a pre-condition(Outer if): if age > 120 or less than 0 ==> invalid entry, and nothing else is checked.

        Age groups:
        Infant (< 1 year), Toddler (2 - 5), Kid (6 - 9), Pre-Teen (10 - 12), Teenager (13 - 17), Young Adult (18 - 20), Adult (21 - 39), Young Middle-Aged Adult (40 - 49), Middle-Aged Adult (50 - 54), Very Young Senior Citizen (55 - 64), Young Senior Citizen (65 - 74), Senior Citizen (75 - 84), Old Senior Citizen (85+)

    Based on the given age find and print which age group they are in.
         */
    int age = 42;
    String print ="";
    if(age > 0 && age < 120) {
        if(age <= 1)  {
            print = "Infant";
        } else if( age <= 5) {
            print = "Toddler";
        } else if( age <= 9){
            print ="Kid";
        } else if (age <= 12){
            print = "Pre-Teen";
        }else if (age <= 17) {
            print = "Teenager";
        } else if (age <= 20) {
            print ="Young Adult";
        } else if (age <= 39) {
            print = " Adult";
        } else if ( age <= 49) {
            print = "Young Middle-Aged Adult";
        } else if ( age <= 54) {
            print = "Middle-Aged Adult";
        } else if (age <= 64) {
            print ="Very Young Senior Citizen";
        } else if ( age <= 74) {
            print = "Young Senior Citizen";
        } else if (age <= 84) {
            print = "Senior Citizen";
        } else {
            print = "Old Senior Citizen";
        }
    } else {
        System.out.println("Invalid entry");
    }
    System.out.println("You are a/an " + print);

    }
}
