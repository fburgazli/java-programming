package office_hours.ArrayPractice_2;

public class SecondBiggestNumber {
    /*
            [IQ] Second Biggest Number
        Given an Array of numbers. Find and print the 2nd biggest number. Note the 2nd biggest should be unique meaning it should be different from the max number
        Example:
        Input: [4,3,1,4,5,2,4,8,4,8] Output:
5
     */
    public static void main(String[] args) {
        int [] nums ={4,3,1,4,5,2,4,8,4,8};
        int max = 0;
        int secondMax = 0;

        for(int each:nums){
            if(each>max){
                secondMax=max;
                max=each;
            }
            if(each>secondMax && each<max){
                secondMax=each;
            }
        }
        System.out.println(secondMax);
    }
}
