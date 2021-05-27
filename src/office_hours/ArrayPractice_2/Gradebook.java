package office_hours.ArrayPractice_2;

public class Gradebook {
    /*
            Declare three arrays:
        1. String array which will hold names for the students (give values)
        2. Int array which has the score of the student got in the quiz (give values)
        3. Char array which will have some letter grade based on the score (empty)
        4. Output the gradebook at the end with all the information
        Grade scale:
        Above 85: A
        Above 75: B
        Above 65: C
        Other: D
     */
    public static void main(String[] args) {
        String[] names = {"Anna","Nancy","Sarah"};
        int[] scores = {80,70,90};
        char[] grades = new char[3];
        for (int i = 0; i < names.length; i++) {
            if(scores[i]>=85){
                grades[i]='A';
            }else if(scores[i]>=75){
                grades[i]='B';
            }else if(scores[i]>=65){
                grades[i]='C';
            }else{
                grades[i]='D';
            }

        }
        System.out.println("*****Gradebook******");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+" | "+scores[i]+" | "+grades[i]);

        }


    }
}
