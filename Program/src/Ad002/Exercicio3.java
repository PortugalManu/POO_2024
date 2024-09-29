package Ad002;
import Uteis.LeDados;
public class Exercicio3 
{
	public static void main(String[] args) 
	{
		String nome1 = LeDados.LeString("Digite o nome da primeira pessoa");		
		int idade1 = LeDados.LeNumeroint("Digite a idade da primeira pessoa");
		
		String nome2 = LeDados.LeString("Digite o nome da segunda pessoa");
		int idade2 = LeDados.LeNumeroint("Digite a idade da segunda pessoa");
		
		if (idade1 < idade2)
		{
			System.out.println("A pessoa mais nova é: " + nome1 + ", Idade: "+ idade1);
		}
		else if (idade2 < idade1)
		{
			System.out.println("A pessoa mais nova é: " + nome2 + ", Idade: "+ idade2);
		}
		else
		{
			System.out.println("Ambas as pessoas têm a mesma idade.");			
		}
	}
}