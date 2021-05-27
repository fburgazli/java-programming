package office_hours.saim_only_tasks.loops_practice_2;

public class BiggestSubstring_Second_Way {
    public static void main(String[] args) {

        String str = "aaabbbcccccddddee";
        int n = str.length();
        int max = 0;
        char result = str.charAt(0);
        int count = 1;
// Traverse string except last character
        for (int i = 0; i < n; i++) {
            // If current character matches with next
            if (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
                count++;
                // If doesn't match, update result
                // (if required) and reset count
            else {
                if (count > max) {
                    max = count;
                    result = str.charAt(i);
                }
                count = 1;
            }
        }
        System.out.println(str.substring(str.indexOf(result), str.lastIndexOf(result) + 1));
    }
}
