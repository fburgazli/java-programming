package day22_string_manipulation3;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java,html,css,selenium,testng,maven,cucumber";

        System.out.println(technologies.indexOf(",")); //first comma at 4
        System.out.println(technologies.lastIndexOf(",")); // last comma at 35
        
        int idxOfCss = technologies.indexOf("css");
        System.out.println("idxOfCss = " + idxOfCss);
        int idxOfCucumber = technologies.indexOf("cucumber");
        System.out.println("idxOfCucumber = " + idxOfCucumber);

        System.out.println(technologies.indexOf("sql")); // -1 because it does not exist.

    }
}
