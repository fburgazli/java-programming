package office_hours.practice050521;

public class FrequencyOfLetters {
    public static void main(String[] args) {
        frequency("AAAAABBBCCDABCD");
    }
    public static void  frequency(String str){


        String checked = "";


        for (int i = 0; i < str.length(); i++) {

            if(checked.contains(str.charAt(i)+"")) continue;

            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            System.out.print(str.charAt(i)+""+count);
            checked += str.charAt(i);
        }
        System.out.println();
        System.out.println(checked);




    }

}
