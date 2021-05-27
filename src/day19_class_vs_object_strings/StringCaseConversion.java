package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";

        System.out.println(word); //CyberTek
        System.out.println(word.toLowerCase()); //cybertek
        System.out.println(word.toUpperCase()); // CYBERTEK

        String wordInLowercase = word.toLowerCase();
        System.out.println("wordInLowercase = " + wordInLowercase);

        System.out.println(word);// previous changes are not permanent
        word = word.toLowerCase(); //changing the original word now because of assignment permanently
        System.out.println(word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        //change Amazon to AMAZON permanently by assigning back
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);



    }
}
