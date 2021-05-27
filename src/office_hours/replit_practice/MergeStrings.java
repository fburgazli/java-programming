package office_hours.replit_practice;

public class MergeStrings {
    public static void main(String[] args) {
        System.out.println(mergeStrings("java", "selenium"));

    }
    public static String mergeStrings(String one, String two) {
        String str="";
        for(int i=0;i<two.length() ||i<one.length();i++){
            if(one.length()== two.length()){
                str += one.charAt(i)+""+two.charAt(i);
            }else if(one.length() > two.length()){
                if(i<two.length()){
                    str += one.charAt(i)+""+two.charAt(i);
                }if(i>=two.length()) {
                    str += one.substring(i);
                    break;
                }

            }else if(one.length() < two.length()){
                if(i<one.length()){
                    str += one.charAt(i)+""+two.charAt(i);
                }if(i>=one.length()) {
                    str += two.substring(i);
                    break;
                }

            }

        }
        return str;

    }
}
