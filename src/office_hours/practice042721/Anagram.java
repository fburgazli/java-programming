package office_hours.practice042721;

import java.util.Arrays;

public class Anagram {
    /*
        Create a method that will accept two Strings. Check if the two Strings are anagram of each other. If they are anagram return true otherwise return false.

    Anagram means the characters of the words are the same, but rearranged in different orders

    For example:
        listen and silent are anagram because the characters in 'listen' can be rearranged to make 'silent'
     */
    public static void main(String[] args) {
        System.out.println(isAnagram("knee","keen"));

    }
    public static boolean isAnagram(String one,String two){
        if(one.length() != two.length()){
            return false;
        }
        int[] count = new int[26];
        one=one.toLowerCase();
        two=two.toLowerCase();
        for (int i = 0; i < one.length(); i++) {
            char letterFromOne = one.charAt(i);
            char letterFromTwo = two.charAt(i);
            count[letterFromOne-97] +=1; //ascii value of a is 97(we can use 'a' here too) so letterFromOne-97 will give us index of array.
            count[letterFromTwo-97] -=1;
        }
        return Arrays.equals(count,new int[26]);
    }
}
