package Aula003;

import java.util.Scanner;

public class UsandoSwitch {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			switch (i) {
			case 1:
				System.out.println("Numero 1");
				break;
			case 2:
				System.out.println("Numero 2 ");
				break;
			default:
				System.out.println("Numero invalido");

			}

		}

	}

	public static void outroswtich(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1.Incluir");
		System.out.println("2.Imprimir");
		System.out.println("Sua opção: ");

		int i = sc.nextInt();
		switch (i) {
		case 1:
			System.out.println("Número 1");
			
			break;
		case 2:
			System.out.println("Número 2");
			break;

		default:
			System.out.println("Número Inválido");
			
		sc.close();

		}

	}

}
