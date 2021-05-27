package office_hours.codingbat_practice;

public class Post4 {
    public static void main(String[] args) {
        int stop =0;
        int[] nums={2, 4, 1, 2};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==4){
                stop=i;

            }
        }
        int[] post4 =new int[nums.length-1-stop];
        for(int i=0;i<nums.length-stop-1;i++){
            post4[i]=nums[i+stop+1];
        }
        for(int each:post4){
            System.out.print(each+" ");
        }
    }
}
