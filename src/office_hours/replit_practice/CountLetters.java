package office_hours.replit_practice;

public class CountLetters {
    public static void main(String[] args) {
        String str = "aaabbcccc";
        int count=0;
        for(int i=0;i < str.length()-1;i++){
            count=0;

            for(int j=0;j<str.length();j++){

                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }

            }

            if(i>=1 && str.charAt(i-1)==str.charAt(i)) continue;
            System.out.print(""+count+str.charAt(i));


        }
    }
}
