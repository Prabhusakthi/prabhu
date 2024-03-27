package test1;
import java.util.Scanner;

	public class test10 {
	    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        long number = scanner.nextLong();

	        int digitCount = countDigits(number);

	        System.out.println("Number of digits in " + number + " is: " + digitCount);
	        scanner.close();
	    }
         private static int countDigits(long num) {
	        num = Math.abs(num);
	        if (num == 0) {
	            return 1; // Special case for 0
	        } else {
	            return (int) Math.log10(num) + 1;
	        }
	    }
	}


