package office_hours.replit_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseNoSpecs {
    public static void main(String[] args) {
        System.out.println(reverseNoSpec("a,b$c"));//"c,b$a"
    } public static String reverseNoSpec(String str) {

       String reversed="";
       String temp ="";
        for (int i = str.length()-1; i >=0 ; i--) {

            if(!((str.charAt(i)>='a' && str.charAt(i)<='z')|| (str.charAt(i)>='A' && str.charAt(i)<='Z'))){
                continue;
            }
            temp += str.charAt(i)+" ";
        }
        List<String> list = new ArrayList<>(Arrays.asList(temp.split(" ")));
        for (int i = 0; i < str.length(); i++) {
            if(!((str.charAt(i)>='a' && str.charAt(i)<='z')|| (str.charAt(i)>='A' && str.charAt(i)<='Z'))){
                list.add(i,str.charAt(i)+"");
            }
        }
        for(String each:list){
            reversed += each;
        }

        return reversed;






    }
}
