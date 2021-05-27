package office_hours.saim_only_tasks.loops_practice_2;

public class BiggestSubstringOfMatchingCharacters {
    /*
        Biggest substring of matching characters
    Given a String find the biggest substring of chars that match and print
    it.
    Ex: aaabbbcccccddddee
    Output: ccccc
     */
    public static void main(String[] args) {
       int max = 0;
        String str = "aaabbbcccccddddee";
        String subStr="";
        for (int i = 0; i < str.length(); i++) {

          subStr= str.substring(i,str.lastIndexOf(str.charAt(i))+1);
          if(subStr.length()>max) {
              max = subStr.length();
          }

        } System.out.println("max = " + max);

        for (int i = 0; i < str.length(); i++) {

            subStr = str.substring(i, str.lastIndexOf(str.charAt(i)) + 1);

            if (subStr.length() == max) {
                System.out.println("subStr = " + subStr);
            }
        }






    }
}
