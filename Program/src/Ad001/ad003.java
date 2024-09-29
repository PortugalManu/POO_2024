package Ad001;

import java.util.Scanner;

public class ad003
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		 int NumFuncionario = sc.nextInt();
   		 int HTrabalhadas = sc.nextInt();
         double ValorHora = sc.nextDouble();

         double salario = HTrabalhadas * ValorHora;
         System.out.println("NUMERO = " + NumFuncionario);
         System.out.println("SALARIO = " + salario);
		sc.close();

	}

}