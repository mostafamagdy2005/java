import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = input.nextInt();

        System.out.println("Enter second number: ");
        int y = input.nextInt();

        int ans = 2;
        int min;

        if (x<y) {
            min = x;
        } else {
            min = y;
        }
        for (int i = 2; i <= min; i++) {
            if (x % i == 0 && y % i == 0)
                ans = i;
        }
        System.out.println(ans);
    }
}