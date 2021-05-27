package office_hours.saim_only_tasks.loops_practice_2;

public class BiggestSubstring_Third_Way {

    public static void main(String[] args) {
        String str = "aaabbbcccccddddee";
        int len = str.length();
        int count = 0;

        // Find the maximum repeating character
        // starting from str[i]
        char result = str.charAt(0);
        for (int i = 0; i < len; i++) {
            int cur_count = 1;
            for (int j = i + 1; j < len; j++) {
                if (str.charAt(i) != str.charAt(j))
                    break;
                cur_count++;
            }
            // Update result if required
            if (cur_count > count) {
                count = cur_count;
                result = str.charAt(i);
            }
        }
        System.out.println(str.substring(str.indexOf(result),str.lastIndexOf(result)+1));
    }
}
