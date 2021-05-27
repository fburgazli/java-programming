package office_hours.saim_only_tasks.loops_practice_3;

public class UniqueCharacters {
    /*
            Given a String, find and print the unique characters. A character is
        unique if it only appears once in the String.
        Ex:
        AAABCCDEEF
        Output:
        BDF
     */
    public static void main(String[] args) {
        String str= "AAABCCDEEF";
        for (int i = 0; i < str.length(); i++) {

        if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
            System.out.print(str.charAt(i)+"");
        }
        }

    }
}
