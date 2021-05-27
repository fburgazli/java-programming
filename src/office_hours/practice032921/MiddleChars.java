package office_hours.practice032921;

public class MiddleChars {
    public static void main(String[] args) {
        String word = "apples";
        if(word.length() %2 ==1){
            System.out.println(word.charAt(word.length()/2));
            System.out.println(word.substring(word.length()/2,word.length()/2+1));
        } else {
            System.out.println(""+word.charAt(word.length()/2-1) +word.charAt(word.length()/2));
            System.out.println(word.substring(word.length()/2-1,word.length()/2+1));


        }

    }
}
