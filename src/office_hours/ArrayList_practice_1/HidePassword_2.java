package office_hours.ArrayList_practice_1;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword_2 {
    public static void main(String[] args) {

        String [] password = {"one", "hi", "hold"};
        ArrayList<String> hiddenPassword = new ArrayList<>();

        for(String each : password) {
            hiddenPassword.add(convertToStars(each));
        }
        System.out.println("Original: " + Arrays.toString(password));
        System.out.println("Hidden: "  + hiddenPassword);

    }

    // helper method: method that does some action, and its called somewhere else

    public static String convertToStars(String str) {
        String stars = "";
        for(int i=0; i < str.length(); i++){
            stars += "*";
        }
        return stars;
    }
}
