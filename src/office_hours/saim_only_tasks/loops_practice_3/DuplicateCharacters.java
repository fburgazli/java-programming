package office_hours.saim_only_tasks.loops_practice_3;

public class DuplicateCharacters {
   /* Given a String, find and print the duplicate characters. A character is
    duplicate if it appears more than once in the String.
    Ex:
    AAABCCDEEF
    Output:
    ACE

    */
    public static void main(String[] args) {
        String str= "AAABCCDEEF";
        String dup ="";
        for (int i = 0; i < str.length(); i++) {

            if(str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i))
                    && !dup.contains(str.charAt(i)+""))
            {
                 dup += str.charAt(i);
            }

        }
        System.out.println(dup);
    }
}
