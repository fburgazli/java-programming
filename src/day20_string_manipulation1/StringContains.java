package day20_string_manipulation1;

public class StringContains {
    public static void main(String[] args) {
        String etsyTitle=    " Wooden spoon | Etsy";
        //check if "|" is in title
        System.out.println(etsyTitle.contains(" | ")); //true
        if(etsyTitle.contains(" | ")){
            System.out.println("Pass - title check passed");
        } else {
            System.out.println("Fail - title check failed");
        }

        String name = "ahmed";
        if(name.contains("a") && name.contains("e")) {
            System.out.println(name + " contains both letters: 'a' and 'e'");

        } else {
            System.out.println(name + " does not contain 'a' and  'e' ");
        }

        name = "Nadir";
        if(name.contains("a") || name.contains("i")){
            System.out.println(name +" contains 'a' or 'i'");
        } else {
            System.out.println("nor a or i  is present");
        }

        String email = "fburgazli@hotmail.com";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("Valid email address");
        }else {
            System.out.println("Please enter a valid email address.");
        }

        //to make it case insensitive.
        if(email.toLowerCase().contains("d")){
            System.out.println("email contains d");
        } else {
            System.out.println("email does not contain d");
        }




    }
}
