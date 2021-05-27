package day05_primitivies_concatenation;

public class JobInfo {
    public static void main(String[] args) {
        String title = "SDET";
        String company = "Chase";
        String jobDescription = "Experience in Java,Selenium,Cucumber,JUnit ,AWS";
        double salary = 123000.00;
        byte yearsOfExp = 4;
        boolean hasBenefits = true;

        System.out.println("Job title: " + title);
        System.out.println("Company: " + company);
        System.out.println("Job Description: " + jobDescription);
        System.out.println("Annual salary: $" + salary);
        System.out.println("Years of Experience: " + yearsOfExp);
        System.out.println("Has Benefits? : " + hasBenefits);
    }
}
