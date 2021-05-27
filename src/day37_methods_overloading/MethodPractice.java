package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("Hello", 5, '*'));

    }
    public static String repeatString(String word,int times , char delimiter){
        String str= "";
        for (int i = 0; i < times; i++) {
            if(i==times-1){
                str +=word;
                break;
            }
            str+=word+delimiter;
        }
        return str;

    }
}
