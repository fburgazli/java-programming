package office_hours.saim_only_tasks;

import java.util.Scanner;

public class StringPractice2 {
    public static void main (String[] args) throws java.lang.Exception{

//Initials
        String name = "james bond";
        String initials = ""+ name.toUpperCase().charAt(0)+name.toUpperCase().charAt(name.indexOf(" ")+1);
        System.out.println(initials);

//  [Move first word]
        String str = "Java is a fun language";
        String firstToEnd = str.substring(str.indexOf(" ")+1) +" "+ str.substring(0,str.indexOf(" "));
        System.out.println(firstToEnd);


// [Creating an email]
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter to words with at least 6 letters:");
        String str1 = scan.next();
        String str2 = scan.next();
        if(str1.length()>=6 && str2.length()>=6){
            String email = str1.toLowerCase().substring(0,4)+str2.toLowerCase().substring(str2.length()-3)+ "@cybertek.com";
            System.out.println(email);
        }else {
            System.out.println("Invalid data");
        }

    }

}
