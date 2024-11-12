package PROVA;

import java.util.Scanner;

//escreva uma aplicação de console que receba um numero inteiro n retornando a soma de todos os números naturais de 1 até n(inclusive).
public class exercicio01 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um numero inteiro");
		
		int N = sc.nextInt();
		
		int S = 0;
		
		for (int i = 1; i <= N; i++)
			S = S + i;
		
		System.out.printf("A soma dos numeros é: " + S);

		sc.close();
	}

}
