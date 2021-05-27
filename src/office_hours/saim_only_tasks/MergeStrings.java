package office_hours.saim_only_tasks;

import day08_casting_scanner.ScannerIntro;

import javax.sound.midi.Soundbank;
import java.util.*;

public class MergeStrings {
    /*
        User is given two Strings, which could vary in length, merge these Strings so these Strings are
    combined into one String. Any extra characters from mismatched length String are at the end.
    Ex:
    String one = abc
    String two = defgh
    Output:
    adbecfgh
    Ex:
    String one = java
    String two = is
    Output:
    jiasva
    ________________________
     */
    public static String mergeStrings(String a, String b){

        String result="";


        if(b.length()>a.length()) {
            for (int i = 0; i < a.length(); i++) {

                result += a.charAt(i) + "" + b.charAt(i);

            }
            result += b.substring(a.length());
        }
        else if(a.length()>=b.length()){
            for (int i = 0; i < b.length(); i++) {

                result += a.charAt(i) + "" + b.charAt(i);

            }
            result += a.substring(b.length());
        }
       return result;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string:");
        String a=scan.nextLine();
        System.out.println("Enter second string:");
        String b=scan.nextLine();
        System.out.println(mergeStrings(a, b));
    }
}
