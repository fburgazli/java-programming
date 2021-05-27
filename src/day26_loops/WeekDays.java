package day26_loops;

public class WeekDays {
    public static void main(String[] args) {

        String day = "";

        for (int i = 0; i <= 10; i++) {
            switch(i){
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
                case 7:
                    day = "Sunday";
                    break;
                default:
                    day= "No such day!It is Java day!";

            }
            System.out.println(i +".day is " + day);

        }
    }
}
