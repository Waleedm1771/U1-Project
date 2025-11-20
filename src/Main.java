import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        int game = 0;
        System.out.println("\nWhat game would you like to play? Type: ");
        System.out.println("1: Rock Paper Scissors");
        System.out.println("2: Tic Tac Toe");
        System.out.println("3: Hide and Seek\n");
        game = scan.nextInt();
        while (game != 1 && game != 2 && game != 3) {
            if (game != 1 && game != 2 && game != 3) {
                System.out.println("That's not a valid game!");
                System.out.println("Type 1, 2, or 3.\n");
            }
            game = scan.nextInt();
        }
        if (game == 1) {
            RockPaperScissors();
        } else if (game == 2) {
            TicTacToe();
        } else if (game == 3) {
            HideAndSeek();
        }
    }

    public static void RockPaperScissors() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int rounds = 0;
        System.out.println("\nYou chose Rock Paper Scissors! I'm sure you know how to play, but I'll explain just in case.");
        Thread.sleep(2000);
        System.out.println("- Choose either Rock, Paper, or Scissors, and I'll do the same.\n- Paper beats Rock, Rock beats Scissors, and Scissors beats Paper.");
        Thread.sleep(2000);
        System.out.println("- If it's a tie, then we both get a point.\n- Finally, choose the amount of rounds, and we'll play!\n");
        Thread.sleep(1000);
        System.out.print("Amount of Rounds: ");
        rounds = scan.nextInt();
        RockPaperScissors game = new RockPaperScissors(rounds);
        System.out.println("\n Great! Let's play!\n");
        System.out.println("When I say \"Shoot\", then type \"Rock\", \"Paper\", or \"Scissors\"\n");
        Thread.sleep(1000);
        for (int i = 1; i<=rounds; i++) {
            game.play(i);
            Thread.sleep(2000);
        }

    }

    public static void TicTacToe() {
        Scanner scan = new Scanner(System.in);

    }

    public static void HideAndSeek() {
        Scanner scan = new Scanner(System.in);

    }
}