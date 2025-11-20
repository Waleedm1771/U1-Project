import java.util.Scanner;
public class RockPaperScissors {

    private int rounds;
    static int playerScore = 0;
    static int gameScore = 0;
    public RockPaperScissors(int numberRounds){
        rounds = numberRounds;
    }

    public static void play (int round) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int[] list = {3, 1, 2, 3, 1};
        int rand = (int) (Math.random() * 3 + 1) ;
        String hand = "";
        if (rand == 1) {
            hand = "Rock";
        } else if (rand == 2) {
            hand = "Paper";
        } else if (rand == 3) {
            hand = "Scissors";
        }
        System.out.println("Ready? Round " + round + ":");
        Thread.sleep(2000);
        System.out.println("Rock");
        Thread.sleep(500);
        System.out.println("Paper");
        Thread.sleep(500);
        System.out.println("Scissors");
        Thread.sleep(500);
        System.out.println("Shoot!\n");
        String answer = scan.nextLine();
        int answer1 = 0;
        while (!(answer.equalsIgnoreCase("Rock") || answer.equalsIgnoreCase("Paper") || answer.equalsIgnoreCase("Scissors"))){
            System.out.println("That didn't register, type \"Rock\", \"Paper\", or \"Scissors\".");
            answer = scan.nextLine();
        }
        System.out.println("I choose " + hand + "!\n");
            if (answer.equalsIgnoreCase("Rock")){
                answer1 = 1;
            } else if (answer.equalsIgnoreCase("Paper")){
                answer1 = 2;
            } else if (answer.equalsIgnoreCase("Scissors")){
                answer1 = 3;
            }
        System.out.println((indexOf(answer1, list)));
        System.out.println((indexOf(rand, list)));
//        if (answer1 == rand) {
//            System.out.println("It was a tie!\n");
//            playerScore++;
//            gameScore++;
//            System.out.println("Player: " + playerScore + " points");
//            System.out.println("Computer: " + gameScore + " points\n");
//        } else if (indexOf(answer1, list) - 1 == indexOf(rand, list)) {
//            System.out.println("You win!\n");
//            playerScore++;
//            System.out.println("Player: " + playerScore + " points");
//            System.out.println("Computer: " + gameScore + " points\n");
//        } else if (indexOf(answer1, list) + 1 == indexOf(rand, list)) {
//            System.out.println("I win!\n");
//            gameScore++;
//            System.out.println("Player: " + playerScore + " points");
//            System.out.println("Computer: " + gameScore + " points\n");
//        }

        if (answer1 == rand) {
            System.out.println("It was a tie!\n");
            playerScore++;
            gameScore++;
            System.out.println("Player: " + playerScore + " points");
            System.out.println("Computer: " + gameScore + " points\n");
        } else if (indexOf(answer1, list) - 1 == placeOf(rand, list)) {
            System.out.println("You win!\n");
            playerScore++;
            System.out.println("Player: " + playerScore + " points");
            System.out.println("Computer: " + gameScore + " points\n");
        } else if (indexOf(answer1, list) + 1 == placeOf(rand, list)) {
            System.out.println("I win!\n");
            gameScore++;
            System.out.println("Player: " + playerScore + " points");
            System.out.println("Computer: " + gameScore + " points\n");
        }


    }

    public static int indexOf(int search, int[] list) {
        for (int i = 1; i<list.length; i++) {
            if (search == list[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int placeOf(int search, int[] list) {
        for (int i = 0; i<list.length; i++) {
            if (search == list[i]) {
                return i;
            }
        }
        return -1;
    }
}

