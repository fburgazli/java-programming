package day37_methods_overloading;

public class GetDayName_2 {
    public static void main(String[] args) {
        System.out.println(getDayName(8));

    }
    public static String getDayName(int day){
        String dayName;

        switch (day){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid day - " + day);
                dayName = null;
                break;
        }
        return dayName;
    }
}
