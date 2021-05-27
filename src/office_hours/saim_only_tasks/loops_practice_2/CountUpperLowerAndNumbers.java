package office_hours.saim_only_tasks.loops_practice_2;

public class CountUpperLowerAndNumbers {
    /*
        Given a String, find and print how many uppercase letter, lowercase
    letter, and number are in the String.
    Ex:
    Input: 2juMp41EEkd4s4
    Output:
    3 uppercase letters
    6 lowercase letters
    5 numbers
     */
    public static void main(String[] args) {
        String str = "2juMp41EEkd4s4";
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='A' && str.charAt(i)<='Z'){
                countUpper++;
            } else if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                countLower++;
            } else if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                countNumber++;
            }
        }
        System.out.println("countUpper = " + countUpper);
        System.out.println("countLower = " + countLower);
        System.out.println("countNumber = " + countNumber);
    }

}
