package office_hours;

import javax.swing.*;

public class Quiz {
    public static void main(String[] args) {
        int[] num1= new int[3];
        int[] num2 = {1,2,3,4};
        num1=num2;
        //for (int i = 0; i < num1.length; i++) {
         //   System.out.println(num1[i]);


            int[][] arr={{1,2,3},{4,5,6}};
            int max=0;
            for(int i=0; i<2 ;i++){
                for (int j = 0; j < 3; j++) {
                    if(arr[i][j]>max){
                        max= arr[i][j];
                    }
                }

            }

            System.out.println(max);
        System.out.println(arr[1][2]);
        String str ="cybertek";
        System.out.println("***"+str.substring(8));
        for (int i = 0; i <str.length() ; i+=2) {
            System.out.print(str.charAt(i));


        }
        int total=0;
        int n1=2;
        int n2=6;
        for (int i = 0; i < 5; i++) {
            if(i%3==0) continue;
            total +=n1+n2;

        }
        System.out.println();
        System.out.println(total);



        }

    }

