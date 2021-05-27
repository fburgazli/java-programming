package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'F';
        if(grade == 'A' || grade =='B' || grade == 'C') {
            System.out.println("Passed");
        } else if (grade == 'D') {
            System.out.println("Qualify for retake");
        } else if ( grade == 'F') {
            System.out.println("Failed");
        } else {
            System.out.println("Invalid grade!");
        }




    }
}
