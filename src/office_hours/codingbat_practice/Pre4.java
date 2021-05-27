package office_hours.codingbat_practice;

public class Pre4 {
    public static void main(String[] args) {
        int stop =0;
        int[] nums ={1, 2, 4, 1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==4){
                stop=i;
                break;
            }
        }
        int[] pre4 =new int[stop];
        for(int i=0;i<stop;i++){
            pre4[i]=nums[i];
        }
        for(int each:pre4){
            System.out.println(each+" ");
        }
    }
}
