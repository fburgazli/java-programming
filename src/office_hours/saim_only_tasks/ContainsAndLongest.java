package office_hours.saim_only_tasks;

public class ContainsAndLongest {
    public static void main(String[] args) {
        /*
        Given three String variables of some text find and print the longest word that also contains 'a'

    Ex:
        "java"
        "mouse"
        "computer"
        Output: java
    Ex:
        "java"
        "mouse"
        "apples"
        Output: apples

Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character.

         */
        //TODO: check this >>>> Option 1  Saim's solution
        String wordOne = "java";
        String wordTwo = "mouse";
        String wordThree = "apples";
        String biggestWordWithA = ""; // java

        if(wordOne.contains("a") && wordOne.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordOne;
        }

        if(wordTwo.contains("a") && wordTwo.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordTwo;
        }

        if(wordThree.contains("a") && wordThree.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordThree;
        }

        if(biggestWordWithA.isEmpty()) {
            System.out.println("No words contained A");
        } else {
            System.out.println("Longest word with A: " + biggestWordWithA);
        }

        //Option 2 (my solution)

        String s1 = "java";
        String s2 = "elemantary school";
        String s3 = "apples";
        if (s1.contains("a") && s2.contains("a") && s3.contains("a")) {
            if (s1.length() > s2.length() && s1.length() > s3.length()) {
                System.out.println(s1);
            } else if (s2.length() > s1.length() && s2.length() > s3.length()) {
                System.out.println(s2);
            }else if (s3.length()>s1.length() && s3.length() > s2.length()){
                System.out.println(s3);
            }
        }else if(s1.contains("a") && s2.contains("a")){
            if(s1.length() > s2.length()){
                System.out.println(s1);
            }else {
                System.out.println(s2);
            }
        }else if(s1.contains("a") && s3.contains("a")){
            if(s1.length() >s3.length()){
                System.out.println(s1);
            }else{
                System.out.println(s3);
            }
        }else if(s2.contains("a") && s3.contains("a")){
            if(s2.length()>s3.length()){
                System.out.println(s2);
            }else{
                System.out.println(s3);
            }
        }else if(s1.contains("a")){
            System.out.println(s1);
        }else if(s2.contains("a")){
            System.out.println(s2);
        }else if ( s3.contains("a")){
            System.out.println(s3);
        }else{
            System.out.println("None of them contains 'a'!");
        }


    }
}
