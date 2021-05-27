package office_hours.replit_practice;

import java.util.Arrays;

public class GetWithE {
    public static void main(String[] args) {
        String[] arr = {"aa", "be", "lol", "lel", "oreo"};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("e")) {
                count++;
            }
        }
        String[] fewValues = new String[count];
        String wordWithE="";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("e")) {
                wordWithE += arr[i]+" ";
                }
            }
        fewValues =wordWithE.split(" ");
        System.out.println(Arrays.toString(fewValues));

        }


    }

