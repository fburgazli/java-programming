package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(8));
        for (int i = 1; i < 9; i++) {
            System.out.println("Day "+ i + " - " +getDayName(i));
        }
        //Store getDayName into a variable,and print the value.
        String dayName = getDayName(8);
        System.out.println(dayName);
        if(dayName==null){ //we can not use .equals() here!!!
            System.out.println("Day name is null for invalid day");
        }

    }
    public static String getDayName(int day){
        switch (day){
            case 1: return "Monday";
            //break; unreachable code,because return already exits the method.
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default:
                System.out.println("Invalid day - " + day);
                return null;

        }

    }
}
