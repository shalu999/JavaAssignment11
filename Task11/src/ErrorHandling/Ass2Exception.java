package ErrorHandling;

import java.util.Scanner;

public class Ass2Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int a = sc.nextInt();
		System.out.println("Enter the denominator");
		int b = sc.nextInt();

		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ae) {
			// System.out.println("We cannot divide by 0");
			ae.printStackTrace();
		}

	}
}