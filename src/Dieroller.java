import java.util.Random;
import java.util.Scanner;

public class Dieroller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean keepPlaying = true;

        while (keepPlaying) {
            System.out.println("\nRoll\tDie1\tDie2\tDie3\tSum");
            System.out.println("-------------------------------------------------");

            int rollCount = 0;
            int dice1, dice2, dice3;


            do {
                dice1 = random.nextInt(6) + 1;
                dice2 = random.nextInt(6) + 1;
                dice3 = random.nextInt(6) + 1;
                int sum = dice1 + dice2 + dice3;

                rollCount++;
                System.out.printf("%3d\t%3d\t%3d\t%3d\t%3d%n", rollCount, dice1, dice2, dice3, sum);
            } while (!(dice1 == dice2 && dice2 == dice3));

            System.out.println("\nTriple  (" + dice1 + ", " + dice2 + ", " + dice3 + ")\n");


            System.out.print("Do you want to roll again (y/n): ");
            String response = scanner.next().trim().toLowerCase();
            keepPlaying = response.equals("y");
        }

        System.out.println("Thanks for playing ");
        scanner.close();
    }
}