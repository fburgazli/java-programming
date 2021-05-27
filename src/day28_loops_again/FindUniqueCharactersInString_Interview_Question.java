package day28_loops_again;

public class FindUniqueCharactersInString_Interview_Question {
    public static void main(String[] args) {
        String str = "Helloworld";
        String uniqueChars= "";
        for (int i = 0; i < str.length(); i++) {

            //if(!str.substring(i+1).contains(""+str.charAt(i))){
            if(!uniqueChars.contains(str.charAt(i)+"")){
                uniqueChars += str.charAt(i);
            }


        }
        System.out.println(uniqueChars);


    }
}
