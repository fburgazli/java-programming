package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "USA";

        if(countryCode.equals(countryCode.toUpperCase())){
            System.out.println("Country code is all UPPERCASE");
        } else {
            System.out.println("country code is not uppercase");
        }

        String word ="Java";
        String wordUppercase = word.toUpperCase();
        if(word.equals(wordUppercase)){
            System.out.println("UPPERCASE");
        } else {
            System.out.println("Not uppercase");
        }
    }
}
