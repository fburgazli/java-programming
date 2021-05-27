package day38_methods;
//import all static methods so that you can just call by method name,without classname.
import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String username = "";
        if(StringUtils.isNullOrEmty(username)){
            System.out.println("FAIL: Username can not be  null or empty!");
        }
        System.out.println("isPalindrome(civic) = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(cyberTek) = " + isPalindrome("Cybertek"));//after import no need to write class name
        System.out.println("Reverse(CyberTek) = " + reverse("CyberTek"));

    }
}
