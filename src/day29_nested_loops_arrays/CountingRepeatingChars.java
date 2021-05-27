package day29_nested_loops_arrays;

public class CountingRepeatingChars {
    public static void main(String[] args) {
        String word = "javavavaaaa";


        for (int i = 0; i < word.length(); i++) {
            char outerChar = word.charAt(i);
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                char innerChar = word.charAt(j);
                if (outerChar == innerChar && i !=j) {
                    count++;
                }
            }
            if(count == 0) {
                System.out.println(word.charAt(i) + " does not repeat.");
            } else {
                System.out.println(word.charAt(i) + " appears " + count + " times.");
            }

        }

    }


}
