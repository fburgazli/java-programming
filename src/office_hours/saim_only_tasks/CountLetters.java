package office_hours.saim_only_tasks;

public class CountLetters {
            /*
            Create a method that will accept a String and print how many times each characters is found in the String

        Ex:
            Input:
                "apple tree"
            Output:
                a - 1
                p - 2
                l - 1
                e - 3
                  - 1  (space char)
                t - 1
                r - 1
     */

    public static void main(String[] args) {
        countLetters("apple tree");
    }
    public static void countLetters(String str){
        String checked="";

        for (int i = 0; i < str.length(); i++) {
            int count = 0 ;

            if(!checked.contains(str.charAt(i)+"")) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }

                System.out.println(str.charAt(i) + " - " + count);
                checked += str.charAt(i);
            }
        }
    }
}
