package day04_variables_intro;

public class VariableNameingRules {
    public static void main(String[] args) {

        // int 1stRow = 4 ; //not working because a variable name can't start with a number
        int row1st =5 ;// works fine

        // int static = 14 ; //not working because a variable name can't be a Java reserved word.
        int static2 = 15; // works fine
        int static_ = 11 ;
        int _static = 12;
        int $tatic = 13 ;
        int staticVar = 14;
        int $ = 10 ; //not encouraged or recommended
        int _ = 3;  //not encouraged or recommended
        int sumOfNumbersFrom1to99 = 0;
        int  underscore_dollar$ = 111; // only special characters allowed to use _ and $

        //we should use meaningful variable names.

        // int number-of-friends = 400 ; not allowed
        int numberOfFriends = 400 ;
        int number_of_friends = 400; // works but not conventional



    }
}
