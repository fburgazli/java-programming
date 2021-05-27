package office_hours.replit_practice;

import java.util.Scanner;

public class StringContainsJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.toLowerCase().contains("java")){
            if(word.toLowerCase().indexOf("java") == 0 || word.toLowerCase().indexOf("java")==1){
                exists = true;
            }else{
                exists = false;
            }
        }else {
            exists =false;
        }

    }
}
