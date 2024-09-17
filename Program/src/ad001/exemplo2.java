package ad001;

import java.util.Scanner;

public class exemplo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		if (N % 2 == 0) {
			System.out.println("Este numero é par");
		} else {
			System.out.println("Este numero é impar");
			sc.close();
		}
	}

}
