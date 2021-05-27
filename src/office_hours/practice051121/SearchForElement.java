package office_hours.practice051121;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchForElement {
    public static void main(String[] args) {
       ArrayList<String> list= new ArrayList<>(Arrays.asList("one","two","three","two"));
        System.out.println(getIndex(list,"two"));
        System.out.println(getIndex(list,"two",2));
        System.out.println(getIndex(list,"two",getIndex(list,"two")+1));
    }
    public static int getIndex(ArrayList<String> words, String element){
        int index= -1;
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).equals(element)){
                index = i ;
                break;
            }
        }
        return index;
    }

    /**
     * Overloading getIndex method
     * @param words
     * @param element
     * @param startIndex
     * @return
     */
    public static int getIndex(ArrayList<String> words, String element,int startIndex){
        int index= -1;
        for (int i = startIndex; i < words.size(); i++) {
            if(words.get(i).equals(element)){
                index = i ;
                break;
            }
        }
        return index;
    }
}
