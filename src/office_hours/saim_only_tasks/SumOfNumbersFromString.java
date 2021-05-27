package office_hours.saim_only_tasks;

public class SumOfNumbersFromString {
    /*
        Create a method that will accept a String and returns the sum of all the numbers in the String.

        Requirement: any numbers that are next to each other are not single digit numbers but instead read as a full number
        Ex: a5bc12def100g
            Here we would have added 5 + 12 + 100
            NOT: 5 + 1 + 2 + 1 + 0 + 0
     */
    public static void main(String[] args) {
        System.out.println(sumOfNums("a5bc12def100g"));
    }
    public static int sumOfNums(String s){
        int sum =0;
        String num="";

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)>='0'&& s.charAt(i)<='9'){
                num += s.charAt(i);
                if((s.charAt(i)>='0'&& s.charAt(i)<='9')&&!(s.charAt(i+1)>='0'&& s.charAt(i+1)<='9')){
                    num +=" ";
                }
            }

        }
        String[] result= num.split(" ");
        for (int i = 0; i <result.length ; i++) {
            sum += Integer.parseInt(result[i]);
        }
        return sum;
    }

}
