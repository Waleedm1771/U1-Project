import java.util.Scanner;

public class HideAndSeek {

    static int playerScore = 0;
    static int gameScore = 0;

    public static int play (int round) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int rand = (int) (Math.random() * 3 + 1) ;
        String a = "   _____\n  /     \\\n /       \\\n/_________\\\n\\_________/\n";
        String b = a + "     O\n    /|\\\n    / \\\n";
        String c = "\n\n\n\n";

        System.out.println("\nReady? Round " + round + ":");
        Thread.sleep(2000);
        System.out.println(c + a + a + a);
        System.out.println("\n\n Alright, now guess which cup I'm in!");
        System.out.println("Cup 1, 2, or 3!");
        int guess = scan.nextInt();


        return 0;
    }

}

