package office_hours.saim_only_tasks;

public class ProblemSetSalary {
    public static void main(String[] args) {
        double hourlyRate = 41.0;
        double weeklyHours = 40;
        double numberOfWeeks = 48;

        if (hourlyRate > 0) {
            if (weeklyHours > 0 && weeklyHours <= 65) {
                if (numberOfWeeks >= 1 && numberOfWeeks <= 52) {
                    double salary = hourlyRate * weeklyHours * numberOfWeeks;
                    System.out.println("Salary = $" + salary);
                } else {
                    System.out.println("Number of weeks cannot be less than 1 or greater than 52");
                }

            } else {
                System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
            }

        } else {
            System.out.println("Hourly Rate cannot be Negative or Zero");
        }

        // Option 2
        boolean hourlyRateIsValid = hourlyRate > 0;
        boolean weeklyHoursAreValid = weeklyHours > 0 && weeklyHours <= 65;
        boolean numberOfWeeksAreValid = numberOfWeeks > 0 && numberOfWeeks <= 52;

        if (hourlyRateIsValid && weeklyHoursAreValid && numberOfWeeksAreValid) {
            System.out.println("Salary is: $" + (hourlyRate * weeklyHours * numberOfWeeks));
        } else {

            if (!hourlyRateIsValid) {
                System.out.println("Hourly Rate cannot be Negative or Zero");
            } else if (!weeklyHoursAreValid) {
                System.out.println("Weekly hours cannot be zero, negative or more than 65");
            } else {
                System.out.println("Number of weeks cannot be less than 1 or greater than 52");
            }

        }

    }
}
