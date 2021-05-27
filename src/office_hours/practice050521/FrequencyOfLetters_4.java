package office_hours.practice050521;

public class FrequencyOfLetters_4 {
    //this will count capitals and lowercases together.
    public static void main(String[] args) {
        System.out.println(countLetters2("AAAAAAAABBCCCCCDEEEEEEBBaaaa"));
    }

    public static String countLetters2(String s){
        String result="";
        char[] capitals = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] lowerCases = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] countCaps = new int[26];
        int[] countLowers = new int[26];

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j <s.length(); j++) {
                if(s.charAt(j)==capitals[i]){
                    countCaps[i]++;
                }
                if(s.charAt(j)==lowerCases[i]){
                    countLowers[i]++;
                }

            }

        }

        for(int i=0;i<capitals.length;i++){
            if(countCaps[i]!=0){
                result +=capitals[i]+""+countCaps[i];
            }
            if(countLowers[i]!=0){
                result +=lowerCases[i]+""+countLowers[i];
            }

        }

        return result;
    }
}
