package Usuario;

import java.util.Scanner;

public class cadastrochefe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		chefeescola chefeescola = new chefeescola(null, null);

		System.out.print("Digite a Matricula: ");
		chefeescola.setMatricula(sc.nextInt());
		
		System.out.print("Digite o Nome: ");
		chefeescola.setNome(sc.next());
		
		System.out.print("Digite o endereço: ");
		chefeescola.setEndereço(sc.next());
		
		System.out.print("Digite o Celular: ");
		chefeescola.setCel(sc.next());
		
		System.out.print("Observação: ");
		chefeescola.setObservação(sc.next());
		
		System.out.println();
		
		System.out.print("Digite a Area: ");
		chefeescola.setArea(sc.next());
		
		System.out.print("Digite o Turno: ");
		chefeescola.setTurno(sc.next());
		
		System.out.print("Escola: ");
		chefeescola.setEscola(sc.next());
		
		System.out.print("Observação: ");
		chefeescola.setObservaçao(sc.next());
		
		System.out.println();
		
		System.out.println(" CADASTRADO COM SUCESSO! ");
		chefeescola.InformaDados();
		
		sc.close();
	}

}
