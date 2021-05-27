package office_hours.replit_practice;

public class UtopianTree {
    /*
    The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year.
    Show 10 years of growth of the Utopian Tree.


     */
    public static void main(String[] args) {

        int year = 1;
        int treeSize =0;
        while(year<=10){
            int growth =0 ;
            if(year<=3){
                growth =1;
                treeSize += growth;
            } else if(year <=10){
                growth =2 ;
                treeSize += growth;
            }
            System.out.println("year " +year+ " - growth "+ growth +"cm");
            System.out.println("tree size: " + treeSize + " cm");
            year++;

        }
    }

}
