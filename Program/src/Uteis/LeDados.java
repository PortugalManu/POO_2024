package Uteis;

import java.util.Scanner;

public class LeDados {

	public static int LeNumeroint(String msg) {

		Scanner sc = new Scanner(System.in);
		int retorno;

		System.out.println(msg + ".:");
		retorno = sc.nextInt();
		return retorno;

	}

	public static String LeString(String msg) {
		
		Scanner sc = new Scanner(System.in);

		String retorno;
		System.out.println(msg);

		retorno = sc.next();
		return retorno;
	}

	public static Byte LeByte(String msg) {
		
		Scanner sc = new Scanner(System.in);
		
		byte retorno;
		System.out.println(msg + ".:");
		
		retorno = sc.nextByte();
		return retorno;
	}

}
