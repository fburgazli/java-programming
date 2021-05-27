package office_hours.ArrayPractice_1;

public class ShortestAndLongestWordsFromStringArray {
    /*
    Write a program that can return the shortest string element from a String array
    Write a program that can return the longest string element from a String array
     */
    public static void main(String[] args) {
        String[] cities = {"Greer","Clemson","Tampa","Fairfax"};

        String shortest=cities[0];
        String longest = cities[0];
        for (int i = 0; i < cities.length; i++) {
            if(cities[i].length()>longest.length()){
                longest=cities[i];
            }
            if(cities[i].length()<shortest.length()){
                shortest=cities[i];
            }

            
        }
        System.out.println("longest = " + longest);
        System.out.println("shortest = " + shortest);

    }
}
