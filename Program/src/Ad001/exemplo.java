package Ad001;

import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int N2 = sc.nextInt();

		if (N < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Positivo");
		}

		if (N2 < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Positivo");
		}
 System.out.println();
 sc.close();
	}

}
