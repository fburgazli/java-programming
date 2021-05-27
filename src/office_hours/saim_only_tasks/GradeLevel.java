package office_hours.saim_only_tasks;

public class GradeLevel {
    /*
    Given a grade level (byte) determine and print which school level someone is in.
1-5: Elementary school 6-8: Middle school 9-12: High school 13-16: College
17-18: Grad School
Other: Invalid grade level given
     */
    public static void main(String[] args) {
        byte grade = 21;
        if(grade>=1 && grade<=5){
            System.out.println("Elementary school");
        }else if(grade<=8){
            System.out.println("Middle school");
        }else if(grade<=12){
            System.out.println("High school");
        }else if(grade<=16){
            System.out.println("College");
        }else if(grade<=18){
            System.out.println("Grad School");
        }else{
            System.out.println("Invalid grade level given");
        }
    }
}
