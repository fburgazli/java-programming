package office_hours.practice050521;

public class FrequencyOfLetters_3 {
    //by using arrays count letters-only capital letters-

    public static void main(String[] args) {
        System.out.println(countLetters2("AAAAAAAAAABBCCCCCDEEEEEEBB"));
    }

    public static String countLetters2(String s){
        String result="";
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int[] count = new int[26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j <s.length(); j++) {
                if(s.charAt(j)==alphabet[i]){
                    count[i]++;
                }

            }

            }
        for(int i=0;i<alphabet.length;i++){
            if(count[i]!=0){
                result +=alphabet[i]+""+count[i];
            }

        }

        return result;
    }
}
