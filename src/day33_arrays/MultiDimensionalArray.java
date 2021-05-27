package day33_arrays;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[][] groups= new String[2][3];

        groups[0][0]="Saim";
        groups[0][1]="Nadir";
        groups[0][2]="Gurhan";
        groups[1][0]="Elvin";
        groups[1][1]="Irem";
        groups[1][2]="John";
        int[] nums1={32,45,23,43};
        int[] nums2={44,87,232,436};
        int[][] nums={{32,45,23,43} , {44,87,232,436}};
        //System.out.println(Arrays.deepToString(nums));
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print("nums["+i+"]"+"["+j+"] = "+nums[i][j]+"\t");
            }
            System.out.println();

        }

        /**
                       0                  1
         0    "Teodora Tsvetanov"    "TeodorasPWD12"
         1    "Anna Ziyayeva"    "AnnaAlmaty123"
         2    "Parvin Altae"    "ParvinVienna321"
         */
        String[][] users = new String[3][2];
        users[0][0]="Teodora Tsvetanov";
        users[0][1]="TeodorasPWD12";
        users[1][0]= "Anna Ziyayeva";
        users[1][1]="AnnaAlmaty123";
        users[2][0]="Parvin Altae";
        users[2][1]="ParvinVienna321";
        String[][] userData={{"Teodora Tsvetanov","TeodorasPWD12"},
                                {"Anna Ziyayeva","AnnaAlmaty123"},
                                {"Parvin Altae","ParvinVienna321"}};

        System.out.println("*****"+users[0][0].split(" ")[0]);//to write just the first name
        System.out.println(users[0][0]+" >> "+users[0][1]);
        System.out.println(users[1][0]+" >> "+users[1][1]);
        System.out.println(users[2][0]+" >> "+users[2][1]);
        System.out.println(Arrays.deepToString(userData));
    }
}
