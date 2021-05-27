package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
       loginVoid("CyberTekStudent","abcd123");
        loginVoid("CyberTek","abcd123");
        loginVoid("CyberTekStudent","abc123");
        System.out.println(login("CyberTekStudent", "abcd123"));
    }
    public static void loginVoid(String username,String password){
        String secretUsername = "cybertekStudent";
        String secretPassword = "abcd123";
        if(username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)){
            System.out.println("Login successful,welcome CybertekStudent!");
        }else{
            System.out.println("Incorrect username or password.");
        }

    }
    public static boolean login(String username,String password){
        String secretUsername = "cybertekStudent";
        String secretPassword = "abcd123";
//        if(username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)){
//            return true;
//        }
//       return false;

        return username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword);

    }


}
