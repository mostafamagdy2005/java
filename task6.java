import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(101);

        Scanner input = new Scanner(System.in);
        int guess = -1;

        while (guess != target) {
            System.out.print("Enter from 0 to 100: ");
            guess = input.nextInt();

            if (guess < target) {
                System.out.println("Too Low");
            } else if (guess > target) {
                System.out.println("Too High");
            } else {
                System.out.println("Intelligently");
            }
        }
    }
}
