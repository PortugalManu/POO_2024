package heranças;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String cod;
		String nom;
		String end;
		String fon;
		String cel;

		System.out.print("Digite o codigo: ");
		cod = sc.next();
		System.out.print("Digite o nome: ");
		nom = sc.next();
		System.out.print("Digite o endereço: ");
		end = sc.next();
		System.out.print("Digite o fone: ");
		fon = sc.next();
		System.out.print("Digite o celular: ");
		cel = sc.next();

		Pessoa p = new Pessoa(cod, nom, end, fon, cel);

		p.MostraPEssoa();

		System.out.print("Digite o codigo: ");
		cod = sc.next();
		System.out.print("Digite o nome: ");
		nom = sc.next();

		Pessoa p2 = new Pessoa(cod, nom);

		p2.MostraPEssoa();

		sc.close();

	}

}
