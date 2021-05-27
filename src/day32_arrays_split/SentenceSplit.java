package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String googleResult= "About 1,810,000 results (0.68 seconds)";
        String[] words = googleResult.split(" ");
        System.out.println("Count = "+ words[1]);
        System.out.println("Time = " + words[3].replace("(",""));
        System.out.println("Time = " + words[3].substring(1));



    }
}
