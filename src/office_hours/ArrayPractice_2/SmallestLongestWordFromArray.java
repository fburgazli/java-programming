package office_hours.ArrayPractice_2;

import java.util.*;

public class SmallestLongestWordFromArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many words you want to enter?");
        String[] words =new String[scan.nextInt()];
        scan.nextLine();

        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter word " + (i+1) +": ");
            words[i]=scan.nextLine();
        }
        System.out.println(Arrays.toString(words));
        String[] smallAndLarge = {words[0],words[0]};
        //0 --> small
        //1 ---> large
        for(String eachWord:words){
            if(eachWord.length()<smallAndLarge[0].length()){
                smallAndLarge[0]=eachWord;
            }
            if(eachWord.length()>smallAndLarge[1].length()){
                smallAndLarge[1]=eachWord;
            }
        }
        System.out.println("Shortest : " + smallAndLarge[0]);
        System.out.println("Longest: "+ smallAndLarge[1]);


    }
}
