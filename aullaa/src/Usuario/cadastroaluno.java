package Usuario;

import java.util.Scanner;

public class cadastroaluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		aluno aluno = new aluno();

		System.out.print("Digite a Matricula: ");
		aluno.setMatricula(sc.nextInt());
		
		System.out.print("Digite o Nome: ");
		aluno.setNome(sc.next());
		
		System.out.print("Digite o endereço: ");
		aluno.setEndereço(sc.next());
		
		System.out.print("Digite o Celular: ");
		aluno.setCel(sc.next());
		
		System.out.print("Observação: ");
		aluno.setObservação(sc.next());
		
		System.out.println();
		
		System.out.print("Digite o Curso: ");
		aluno.setCurso(sc.next());
		
		System.out.print("Digite o Turno: ");
		aluno.setTurno(sc.next());
		
		System.out.print("Situação: ");
		aluno.setSituaçao(sc.next());
		
		System.out.print("Observação: ");
		aluno.setObservçao(sc.next());
		
		System.out.println();
		
		System.out.println(" CADASTRADO COM SUCESSO! ");
		aluno.InformaDados();
		
		sc.close();

	}

}
