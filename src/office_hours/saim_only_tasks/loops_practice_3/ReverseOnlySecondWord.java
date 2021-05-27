package office_hours.saim_only_tasks.loops_practice_3;

public class ReverseOnlySecondWord {
    /*
        Given a String with three words separated by spaces. Reverse only the
        second word and return the modified String
        Ex:
        I love java
        I evol java
     */
    public static void main(String[] args) {
        String str = "I love Java";
        String firstWord = str.substring(0,str.indexOf(" "));
        String secondWord = str.substring(str.indexOf(" ")+1,str.lastIndexOf(" "));
        String thirdWord = str.substring(str.lastIndexOf(" ")+1);
        //System.out.println("firstWord = " + firstWord);
        //System.out.println("secondWord = " + secondWord);
        //System.out.println("thirdWord = " + thirdWord);
        String reverse = "";
        for (int i = secondWord.length()-1 ; i>=0; i--) {
            reverse += secondWord.charAt(i);
           
        }
        //System.out.println("reverse = " + reverse);
        System.out.println(str);
        System.out.println(firstWord + " " + reverse + " " + thirdWord);



    }
}
