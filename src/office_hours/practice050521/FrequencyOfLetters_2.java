package office_hours.practice050521;

public class FrequencyOfLetters_2 {
    public static void main(String[] args) {
        System.out.println(countLetters("AAAAAABBBCDDDDDDC"));
    }
    public static String countLetters(String str) {
        int count = 0;
        String checked = "";
        String result = "";
        for (char c = 'A'; c <= 'Z'; c++) {
            count = 0;
            if (checked.contains(c + "")) {
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == c) {
                    count++;
                }
            }
            if (count > 0) {
                result += c + "" + count + "";
                checked += c;
            }
        }
        return result;
    }
}