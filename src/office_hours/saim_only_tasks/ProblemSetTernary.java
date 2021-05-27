package office_hours.saim_only_tasks;

public class ProblemSetTernary {
    public static void main(String[] args) {
        int time = 22;

        if(time>=0 && time <= 24) {
            String result = time >= 0 && time <= 11 ? "Morning" : "Night";
            System.out.println(result);
        } else {
            System.out.println("Invalid time entry");
        }

        //nested ternary
        String result2 =  time>=0 && time <=24 ? (time>=0 && time<=11 ? "Morning" : "Night") : "Invalid time entry";
        System.out.println(result2);

    }
}
