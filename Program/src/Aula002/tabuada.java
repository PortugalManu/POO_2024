package Aula002;

import java.util.Scanner;

public class tabuada {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// -----------------------------------------------------------------------------------------------
		
		int I = 0;
		int N;
		
		// -----------------------------------------------------------------------------------------------

		
		System.out.print("Digito o numero da tabuada : ");
		N = sc.nextInt();
		while (I <= N) {
			int R = (I * N);
			System.out.println(I + "x" + N + "= " + R);
			I = I + 1;
		}
		sc.close();
	}
}
