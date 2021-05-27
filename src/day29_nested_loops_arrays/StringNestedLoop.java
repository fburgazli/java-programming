package day29_nested_loops_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        int countUniq = 0;
        int countDuplicates = 0;
        //find duplicates and count
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();

        }
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j <word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();

        }


//        //find uniques chars
//        for (int i = 0; i < word.length(); i++) {
//            for(int j=i+1; j< word.length() ; j++){
//              if(word.charAt(i) == word.charAt(j){
//              countDuplicate++;
//              }
        // if(word.charAt(i) != word.charAt(j){
        //             countUniq++;
        //              }
//            }

//
//            }
//
//        }
        //print char and number of occurrences
    }
}
