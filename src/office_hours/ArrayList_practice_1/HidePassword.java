package office_hours.ArrayList_practice_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HidePassword {
    /*
    Given an array of passwords (String). Hide each password as a star (*)
        and show the hidden password
        Ex:
        Input:
        {"one", "hi", "hold}
        Output:
        [ ***, **, **** ]
     */
    public static void main(String[] args) {
        List<String> pass = new ArrayList<>(Arrays.asList("one","hi","hold"));
        List<String> hidden = new ArrayList<>();
        for (int i = 0; i < pass.size(); i++) {
            String temp="";
            for (int j = 0; j < pass.get(i).length(); j++) {
                temp +="*";
            }
            hidden.add(temp);
        }
        System.out.println(hidden);
    }
}
