package day17_ternary_nested_conditions;

public class MoreTernaryPractice {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = hourlyRate > 45 ? "Accept" : "Negotiate";
        System.out.println("reply = " + reply);

        String todaysClass = "Java";
        String teacher = todaysClass.equals("Java") ? "Murodil&Saim" : "Nadir";
        System.out.println("teacher = " + teacher);
        
        boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive ? "Have DL and can drive" : "No DL,can not drive ";

        System.out.println("Can drive? = " + driving);
                    }
}
