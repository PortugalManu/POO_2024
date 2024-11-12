package heranças;

import java.util.Scanner;

public class CadastraMotorista {

	public static void main(String[] args)
	{
		
		String carteira;
		String dtvencimento;
		String nome;
		String cod;
		
		Scanner sc = new Scanner(System.in);
		
		Motorista M = new Motorista();
		System.out.println("Digite o código.:  ");
		cod = sc.next();
		
		System.out.println("Digite o nome do Motorista.:  ");
		nome = sc.next();
		
		System.out.println("Digite a CNH.:  ");
		carteira = sc.next();
		
		System.out.println("Digite a Data de Vencimento.:  ");
		dtvencimento = sc.next();
		
		M.setCnh(carteira);
		M.setDatavenc(dtvencimento);
		M.setNome(nome);
		M.setCodigo(cod);
		
		M.MostraPEssoa();
		
		Motorista m1 = new Motorista("55654654");
		m1.MostraPEssoa();
		
		sc.close();

	}

}
