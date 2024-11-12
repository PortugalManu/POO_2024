package Usuario;

import java.util.Scanner;

public class cadastroprofessor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		professor professor = new professor(null, null);

		System.out.print("Digite a Matricula: ");
		professor.setMatricula(sc.nextInt());
		
		System.out.print("Digite o Nome: ");
		professor.setNome(sc.next());
		
		System.out.print("Digite o endereço: ");
		professor.setEndereço(sc.next());
		
		System.out.print("Digite o Celular: ");
		professor.setCel(sc.next());
		
		System.out.print("Observação: ");
		professor.setObservação(sc.next());
		
		System.out.println();
		
		System.out.print("Digite a Area: ");
		professor.setArea(sc.next());
		
		System.out.print("Digite o Turno: ");
		professor.setTurno(sc.next());
		
		
		System.out.print("Observação: ");
		professor.setObservaçao(sc.next());
		
		System.out.println();
		
		System.out.println(" CADASTRADO COM SUCESSO! ");
		professor.InformaDados();
		
		sc.close();
	}

}
