package test1;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the value for 'a': ");
        int a = scanner.nextInt();

        System.out.print("Enter the value for 'b': ");
        int b = scanner.nextInt();

        System.out.print("Enter the value for 'c': ");
        int c = scanner.nextInt();

        System.out.print("Enter the value for 'd': ");
        int d = scanner.nextInt();

        if ((a + b) > (c + d)) {
            System.out.println("Sum of 'a' and 'b' is greater than the sum of 'c' and 'd'");
        } else {
            System.out.println("Sum of 'a' and 'b' is NOT greater than the sum of 'c' and 'd'");
        }

       scanner.close();
    }
}
