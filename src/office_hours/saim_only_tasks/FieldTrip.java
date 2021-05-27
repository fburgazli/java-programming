package office_hours.saim_only_tasks;

public class FieldTrip {
    public static void main(String[] args) {
        /*
        [Field Trip]

Your school goes on a Field trip each year. The place you go will be based on your grade. Given some grade number (1-6) figure out the details of your field trip. Print the information at the end.

    Data based on grade:

         */
        int grade = 5 ;
        String location = "";
        int numberOfGroups = 0;
        String teacherInCharge = "";

        switch (grade) {
            case 1:
            location =  "Apple orchard";
            numberOfGroups = 3;
            teacherInCharge = "Ms. Smith";
            break;

            case 2:
            location = "Zoo";
            numberOfGroups = 7;
            teacherInCharge = "Mr. Lee";
            break;

            case 3:
            location = "Aquarium";
            numberOfGroups = 5;
            teacherInCharge = "Ms. Wilson";
            break;

            case 4:
            location = "Movie theater";
            numberOfGroups = 2;
            teacherInCharge = "Ms. Reyes";
            break;

            case 5:
            location = "Museum";
            numberOfGroups = 5;
            teacherInCharge = "Ms. Lela";
            break;

            case 6 :
            location = "Six Flags";
            numberOfGroups = 8;
            teacherInCharge = "Mr. Watt";
            break;
            default:
                System.out.println("Invalid entry");
                return;
        }
        System.out.println("Grade = " + grade);
        System.out.println("location = " + location);
        System.out.println("numberOfGroups = " + numberOfGroups);
        System.out.println("teacherInCharge = " + teacherInCharge);
    }
}
