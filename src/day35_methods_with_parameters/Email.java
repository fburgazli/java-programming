package day35_methods_with_parameters;

public class Email {
    public static void main(String[] args) {
         buildEmail("John Ward III","CybertekSchool");
    }

    public static void buildEmail(String name, String domain) {
        name =name.toLowerCase().replace(" ","_");
        domain = domain.toLowerCase();

        String email = name+"@"+domain+".com";
        System.out.println("Email : "+ email);
    }
}
