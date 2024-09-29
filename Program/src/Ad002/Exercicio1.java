package Ad002;
import Uteis.LeDados;

public class Exercicio1 
{
	public static void main(String[] args) 
	{

		int n1 = LeDados.LeNumeroint("Digite o primeiro número ");
		int n2 = LeDados.LeNumeroint("Digite o segundo número ");
		
		if (n1 > n2) 
		{
			System.out.println("O maior número é: " + n1);			
		}
		else if (n2 > n1) 
		{
			System.out.println("O maior número é: " + n2);		
		}
		else
		{
			System.out.println("Os números são iguais");
		}
	}
}