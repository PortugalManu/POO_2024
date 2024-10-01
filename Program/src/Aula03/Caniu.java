package Aula03;

import java.util.Scanner;

public class Caniu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Aula3 pitbull = new Aula3();
		Aula3 basset = new Aula3();

		System.out.print("Entre com o nome do primeiro cachorro pitbull: ");
		pitbull.nome = sc.next();

		System.out.print("Entre com a cor do primeiro cachorro pitbull: ");
		pitbull.cordopelo = sc.next();

		System.out.print("Entre com o idade do primeiro cachorro pitbull: ");
		pitbull.idade = sc.nextInt();
		
		System.out.println();

		//----------------------------------------------------------------------------------------
		
		System.out.print("Entre com o nome do primeiro cachorro basset: ");
		basset.nome = sc.next();

		System.out.print("Entre com a cor do primeiro cachorro basset: ");
		basset.cordopelo = sc.next();

		System.out.print("Entre com o idade do primeiro cachorro basset: ");
		basset.idade = sc.nextInt();
		
		pitbull.informarDados();
		basset.informarDados();
		
		sc.close();
	}

}