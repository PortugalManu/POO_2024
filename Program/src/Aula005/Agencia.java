package Aula005;

import java.util.Scanner;

public class Agencia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Automovel carro = new Automovel();

		System.out.print("Digite o Modelo do Carro: ");
		carro.setModelo(sc.next());
		System.out.print("Digite a Cor do Carro: ");
		carro.setCor(sc.next());
		System.out.print("Digite a Placa do Carro: ");
		carro.setPlaca(sc.next());
		System.out.print("Digite o Ano do Carro: ");
		carro.setAno(sc.nextInt());
		System.out.print("Digite o Estado do Motor: ");
		carro.setMotor(true);

		carro.InformaDados();

		sc.close();
	}

}
