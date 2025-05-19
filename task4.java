import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = input.nextLine();

        System.out.println("Enter the index : ");
        int index = input.nextInt();

        if (index >= 0 && index < text.length()) {
            char x= text.charAt(index);
            System.out.println("The character at position " + index + " is " + x);
        }
    }
}