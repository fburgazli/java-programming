package office_hours.codingbat_practice;

public class Sum67 {
    public static void main(String[] args) {
        int sum =0;
        int stop6=0;
        int stop7=0;
        int[] nums={1, 2, 2};
        for(int i =0; i< nums.length ;i++){
            if(nums[i]==6){
                stop6=i;

            }if(nums[i]==7){
                stop7=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(stop6==0 &&stop7==0) {
                sum += nums[i];
            }else {
                if (i < stop6) {
                    sum += nums[i];
                }
                if (i > stop7) {
                    sum += nums[i];
                }
            }
        } System.out.println(sum);

    }
}
