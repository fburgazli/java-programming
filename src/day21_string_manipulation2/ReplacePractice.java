package day21_string_manipulation2;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = " + word);

        word = word.replace("hub", "lab");
        System.out.println("word = " + word);
        System.out.println(word.replace("i", "o").replace("a", "i"));

        String sentence = "java is fun";
        String withNospace = sentence.replace(" ","");
        System.out.println("withNospace = " + withNospace);
        sentence = sentence.replace("java", "selenium").
                            replace("fun","a lot of fun");
        System.out.println(sentence);

        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over ", "").replace("," ,"").replace(" results for java book","");
        System.out.println("result = " + result);
        int count = Integer.parseInt(result);
        System.out.println("count = " + count);

    }
}
