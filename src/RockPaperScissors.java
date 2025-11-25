import java.util.Scanner;

public class RockPaperScissors {

    static int playerScore = 0;
    static int gameScore = 0;

    public static int play (int round) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
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

        if (answer1 == rand) {
            System.out.println("It was a tie!\n");
            playerScore++;
            gameScore++;
            System.out.println("Player: " + playerScore + " points");
            System.out.println("Computer: " + gameScore + " points\n");
            return 3;
        } else if (answer1 - 1 == rand || answer1 + 2 == rand) {
            System.out.println("You win!\n");
            playerScore++;
            System.out.println("Player: " + playerScore + " points");
            System.out.println("Computer: " + gameScore + " points\n");
            return 1;
        } else if (answer1 + 1 == rand || answer1 - 2 == rand) {
            System.out.println("I win!\n");
            gameScore++;
            System.out.println("Player: " + playerScore + " points");
            System.out.println("Computer: " + gameScore + " points\n");
            return 2;
        }

        return 0;
    }

}

