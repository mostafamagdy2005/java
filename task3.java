import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum =0;
        while (num >0) {
            int x =num%10;
            sum =sum+ x % 10;
            num = num/ 10;
        }
        System.out.println(sum);
    }
}