package office_hours.practice050521;

import java.util.ArrayList;
import java.util.Arrays;

public class AlphabetArrayWithForLoop {
    public static void main(String[] args) {
        char[] alphabet = new char[26];
        char c = 'A';
        for (int i = 0; i < 26; i++) {
            alphabet[i] = c;
            c++;
        }
        System.out.println(Arrays.toString(alphabet));
    }
}
