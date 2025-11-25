import java.util.Scanner;

public class HideAndSeek {

    static int playerScore = 0;
    static int gameScore = 0;

    public static int play (int round) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int rand = (int) (Math.random() * 3 + 1);
        String a = "   _____\n  /     \\\n /       \\\n/_________\\\n\\_________/\n";
        String b = a + "     O\n    /|\\\n    / \\\n";
        String c = "\n\n\n";
        String d = "---------------------";

        System.out.println("\nReady? Round " + round + ":");
        Thread.sleep(2000);
        System.out.println(c + a + a + a);
        System.out.println("\n\n Alright, now guess which cup I'm in!");
        System.out.println("Cup 1, 2, or 3!");
        int guess = scan.nextInt();

        if (rand == 1) {
            System.out.println(c + b + a + a + d);
        } else if (rand == 2) {
            System.out.println(c + a + b + a + d);
        } else if (rand == 3){
            System.out.println(c + a + a + b + d);
        }

        if (guess == rand) {
            System.out.println("Great catch, you got it!");
            return 1;
        } else {
            System.out.println("Try again!");
            rand = (int) (Math.random() * 3 + 1) ;
            Thread.sleep(3000);
            System.out.println(c + a + a + a);
            System.out.println("\n\n Alright, now guess which cup I'm in!");
            System.out.println("Cup 1, 2, or 3!");
            guess = scan.nextInt();

            if (rand == 1) {
                System.out.println(c + b + a + a + d);
            } else if (rand == 2) {
                System.out.println(c + a + b + a + d);
            } else if (rand == 3){
                System.out.println(c + a + a + b + d);
            }

            if (guess == rand) {
                System.out.println("Great catch, you got it!");
                return 1;
            } else {
                System.out.println("That was your second chance! You failed :(");
                return 0;
            }
        }

    }

}

