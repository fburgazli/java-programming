package office_hours.saim_only_tasks;

public class OfficeHoursSchedule {
    public static void main(String[] args) {
        String day = "Monday";
        String print = "";
        switch (day){
            case "Monday": case "Tuesday" : case "Wednesday":
                print ="Office hours at 5.30 - 6.45 EST";
                break;
            case "Thursday":
                print ="Soft Skills day, no office hours";
                break;
            case "Friday":
                print = "Day off";
                break;
            case "Saturday": case "Sunday":
                print = "Already a long day,  no office hours.";
            default:
                print = "Invalid day given";
                return;
        }
        System.out.println(print + " on " + day);
    }
}
