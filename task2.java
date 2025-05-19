import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = input.nextInt();
        System.out.println("Enter the second number: ");
        int y = input.nextInt();
        System.out.println("Enter the third number: ");
        int z = input.nextInt();

        int max=x;
        if(y > max){max=y;
        }
        if(z > max){max=z;
        }
        System.out.println("The maximum number is "+max);

        int min=x;
        if(y < min){min=y;
        }
        if(z < min){min=z;
        }
        System.out.println("The minimum number is "+min);
    }
}