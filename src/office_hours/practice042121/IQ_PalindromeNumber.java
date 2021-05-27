package office_hours.practice042121;

public class IQ_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));

    }
    public static boolean isPalindrome(int number){
        int reverse =0 ;
        int temp = number;
        while( temp != 0){
            int lastDigit = temp % 10;
            reverse = reverse*10 + lastDigit;
            temp /=10;
        }

        return reverse == number ;
    }

}
