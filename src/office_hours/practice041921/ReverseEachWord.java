package office_hours.practice041921;

import day38_methods.StringUtils;

public class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println(reverse("java is fun") );;
    }


    public static String reverse(String str){
        String reversed ="";
        for(String each: str.split(" ")){
            reversed += StringUtils.reverse(each) + " ";
        }
        return reversed.trim();
    }
}
