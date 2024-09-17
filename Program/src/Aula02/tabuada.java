package Aula02;

import java.util.Scanner;

public class tabuada
{
	public static void main(String[] args) 
	{
			
	     Scanner sc = new Scanner(System.in);
		 
		int I = 1;
		int N = sc.nextInt();
		
				while (I <= N ) {
					int R = (I * N);
				System.out.println(I + "x" + N + "= "+ R);
 I=I+1;
				}
		sc.close();
	}
}
