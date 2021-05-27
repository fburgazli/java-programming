package office_hours.replit_practice;

import java.util.Arrays;

public class PrintShortestWord2 {
    public static void main(String[] args) {
        String str ="volt, olive, fish, hot pursuit, warning, python, java, coffee, part";
        String[] strArr = str.split(", ");
        int min = strArr[0].length();
        System.out.println(Arrays.toString(strArr));

        for(int j=0;j<strArr.length;j++){
            if(strArr[j].length()<min){
                min=strArr[j].length();
            }
        }
        String minStr="";
        for(int i=0;i<strArr.length;i++){
            if((strArr[i].length()==min)){
                minStr += strArr[i]+" ";
            }
        }
        System.out.println(minStr);
        String[] minArr=minStr.trim().split(" ");
        Arrays.sort(minArr);
        System.out.println(Arrays.toString(minArr));
    }

}
