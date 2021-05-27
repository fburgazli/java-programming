package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'g';
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter){
                index = i ;
                //System.out.println(letter +" is found at index " + index);
                //we can print it here but it is better to print outside of the for loop
                //break;//exit for loop
                //return; exit from main method and does not check the rest of the code below.
            }

        }
        if(index == -1){
            System.out.println(letter + " is not found.");
        } else {
            System.out.println(letter +" is found at index " + index);
        }
    }
}
