package Ad002;
import Uteis.LeDados;

public class Exercicio2 
{
	public static void main(String[] args)
	{
		int n = LeDados.LeNumeroint("Digite um número para calcular o fatorial");
		int f = 1;
		
		for(int i = 1; i<= n; i++)
		{
			f = f * i;
		}
		
		System.out.println("O fatorial de " + n + " é:" + f);
	}
}