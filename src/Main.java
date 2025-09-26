import java.util.Scanner; //imported scanner tool

public class Main
{

    public static void main(String[] args)
    {
        // getting user input and values
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator, how much is the price without tip? (No symbols)");
        double basePrice = scan.nextDouble();
        scan.nextLine();

        System.out.println("What about how much percent you want to tip?");
        double tip = (scan.nextDouble() * basePrice) / 100;
        scan.nextLine();

        System.out.println("And how many people are there in your group?");
        int people = scan.nextInt();
        scan.nextLine();

        // printing all the values out organized with spacing.
        double total = basePrice + tip;
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("| Total tip: $" + String.format("%.2f", tip) + "                  |");
        System.out.println("---------------------------------------");
        System.out.println("| Total price: $" + String.format("%.2f", total) + "               |");
        System.out.println("---------------------------------------");
        System.out.println("| Total bill per person: $" + String.format("%.2f", total / people) + "      |");
        System.out.println("---------------------------------------");
        System.out.println("| Total tip per person: $" + String.format("%.2f", tip / people) + "        |");
        System.out.println("---------------------------------------");
    }
}
