package day21_string_manipulation2;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.indexOf("g")); // 0
        System.out.println(word.indexOf("u")); // 4
        System.out.println(word.indexOf("z")); // -1 if not exist.
        System.out.println(word.indexOf("hub")); //3 first letters position

    }
}
