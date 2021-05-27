package day28_loops_again;

public class FindUniqueCharsInStringRemoveRepeating {
            public static void main(String[] args) {
            String str = "Helloworld";
            String uniqueChars = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                    uniqueChars += str.charAt(i);
                }

            }
            System.out.println(uniqueChars);
        }
    }

