package day29_nested_loops_arrays;

public class CountCharsInAString {
    public static void main(String[] args) {
        String word ="java";
        String checked ="";
        for (int i = 0; i < word.length() ; i++) {
            char outerChar = word.charAt(i);
            int count = 0;
           // if(!checked.contains(outerChar+"")){
            //    checked += outerChar+"";

            for (int j = 0; j < word.length() ; j++) {
                char innerChar = word.charAt(j);
                if(outerChar == innerChar){
                    count++;
                }
            }
            //Is it possible to print 'a' just once here?
            // yes with additional logic. try to how can you stop the 2nd 'a' from being checked
            // define a new String checked =""; if it not contains checked before then run the code
            System.out.println(outerChar + " = "+ count);

        }
    }
}
