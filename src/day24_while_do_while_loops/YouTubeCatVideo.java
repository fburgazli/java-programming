package day24_while_do_while_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds= 0;
        System.out.println("Starting :World's smallest cat \uD83D\uDC08- BBC");
        while( seconds <=17){

            System.out.println("Watching YouTube video for " + seconds + " seconds");
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching cat video,let's start another one");




    }



}
