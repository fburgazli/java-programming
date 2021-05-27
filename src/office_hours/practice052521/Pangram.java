package office_hours.practice052521;

import day31_arrays.CharArray;

public class Pangram {
    public static void main(String[] args) {
        String str1 = "A quick brown fox jumps over the lazy dog.";
        System.out.println(isPangram(str1));
        String str2= "Back in June we delivered oxygen equipment of the same size.";
        System.out.println(isPangram(str2));

    }

    public static boolean isPangram(String str){
        String alp = "abcdefghijklmnopqrstuvwxyz";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
              alp = alp.replace(""+str.charAt(i),"");
            }
        }
        return alp.isEmpty();
    }
}
