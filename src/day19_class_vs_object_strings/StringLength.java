package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {

        String name ="Fikret";
        System.out.println("name = " + name);
        System.out.println("Length = " + name.length());

        String password = "abc123";
        if(password.length()>=6){
            System.out.println("Password is good");
        } else {
            System.out.println("Password is too short.");
        }
        

    }
}
