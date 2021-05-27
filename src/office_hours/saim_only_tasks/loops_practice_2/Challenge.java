package office_hours.saim_only_tasks.loops_practice_2;

import java.util.Random;

public class Challenge {
    /*After Arrays try this own more time
        CHALLENGE – THIS WILL MAY BE DIFFICULT
        BUT TRY IT. DON’T SPEND TOO MUCH TIME
        Generate a random number that is six digits long. Each digit in this
        number should be unique, meaning the number 6 digit number should
        have 6 different character numbers that make it up. Print the number.
        HINTS: Loops, Strings, Random
     */
    public static void main(String[] args) {
        Random randomNum = new Random();

        String uniqueNum ="";
        String source ="0123456789";
        for (int i = 0; i < source.length(); i++) {
            int index = randomNum.nextInt(10);

            if(!uniqueNum.contains(source.charAt(index)+"")){
                uniqueNum += source.charAt(index);
                if(uniqueNum.length()==6){
                    break;
                }
            }

        }

        System.out.println(uniqueNum);



    }



}