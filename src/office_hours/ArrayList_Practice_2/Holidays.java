package office_hours.ArrayList_Practice_2;

import com.sun.tools.javac.code.Lint;

import java.util.ArrayList;
import java.util.List;

public class Holidays {
    /*
    Create a method that accept an ArrayList of Strings. The String elements will be
    Holidays
    Create a method that will accept a number and return an ArrayList of Strings. This
    number will represent a month number. The String elements returned will be all
    the holidays in the given month.
    Note: If a invalid month number is given as a parameter (not between 1 and 12)
    then return null
    See the next page for month number and holiday data (This is just a sample based
    on federal holidays. You can add other ones if you want)
    Holidays - Data
    1: New Years day, Martin Luther King, Jr. Day
    2: President’s Day
    5: Memorial Day
    6: Independence Day
    9: Labor Day
    10: Columbus Day
    11: Veterans Day, Thanksgiving Day
    12: Christmas Day
    3, 4, 7, 8: None
     */
    public static void main(String[] args) {
        System.out.println(getHolidays(12));
        System.out.println(getHolidays(3));
        System.out.println(getHolidays(15));
        System.out.println(getHolidays(1));
    }
    public static List<String> getHolidays(int n){
        List<String > holidays = new ArrayList<>();
        if(n>=1 && n<=12) {
            switch (n) {
                case 1:
                    holidays.add("New Years day");
                    holidays.add("Martin Luther King Jr. Day");
                    break;
                case 2:
                    holidays.add("President’s Day");
                    break;
                case 5:
                    holidays.add("Memorial Day");
                    break;
                case 6:
                    holidays.add("Independence Day");
                    break;
                case 9:
                    holidays.add("Labor Day");
                    break;
                case 10:
                    holidays.add("Columbus Day");
                    break;
                case 11:
                    holidays.add("Veterans Day");
                    holidays.add("Thanksgiving Day");
                    break;
                case 12:
                    holidays.add("Christmas Day");
                    break;
                case 3:
                case 4:
                case 7:
                case 8:
                    break;
            }
            return holidays;
        }
        return null;
    }
}
