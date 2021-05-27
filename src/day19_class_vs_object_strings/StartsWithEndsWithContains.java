package day19_class_vs_object_strings;

public class StartsWithEndsWithContains {
    public static void main(String[] args) {
        String word = "selenium";
        System.out.println(word.startsWith("s")); //true
        System.out.println(word.startsWith("se"));//true
        System.out.println(word.startsWith("sel"));//true
        System.out.println(word.startsWith("sele"));//true
        System.out.println(word.startsWith("ja"));//false
        System.out.println(word.startsWith("S"));//false
        System.out.println(word.startsWith("Se")); //false

        System.out.println(word.endsWith("um")); //true
        System.out.println(word.endsWith("ium")); //true
        System.out.println(word.endsWith("nium"));//true
        System.out.println(word.endsWith("elenium"));//true
        System.out.println(word.endsWith("selenium"));//true
        System.out.println(word.endsWith("UM"));//false

        System.out.println(word.contains("um")); //true
        System.out.println(word.contains("iu"));//true
        System.out.println(word.contains("ele"));//true
        System.out.println(word.contains("sele"));//true
        System.out.println(word.contains("kel"));//false


       String name ="Dr.Nadir";
       if(name.startsWith("Mr.")){
           System.out.println("Male");
       }else if(name.startsWith("Mrs.")){
           System.out.println("Married woman");
       }else if(name.startsWith("Ms.")){
           System.out.println("Single woman");
       } else if(name.startsWith("Dr.")){
           System.out.println("Doctor");
       }else if(name.startsWith("Sr.")){
           System.out.println("Senior");
       } else {
           System.out.println("Regular name");
       }

       String url = "https://codingbat.com";
       if(url.endsWith(".com")){
           System.out.println("Commercial website");
       } else if (url.endsWith(".gov")){
           System.out.println("Government website");
       } else if(url.endsWith(".edu")){
           System.out.println("Education website");
       }else if(url.endsWith(".org")){
           System.out.println("Organization website");
       }

    }
}
