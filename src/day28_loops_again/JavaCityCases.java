package day28_loops_again;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases = 0;
        for(int day =1 ; day<=31 ; day++) {
            if(day%7 == 0){
                totalCases +=500;
            }else {
                totalCases += 200;

            }
            //System.out.println("Day- "+day + " there are "+ totalCases + " cases.");
        }
        System.out.println("JavaCity March 2021 Total Cases: " + totalCases);
    }
}
