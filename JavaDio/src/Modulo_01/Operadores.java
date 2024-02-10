package Modulo_01;

import java.util.Date;

public class Operadores {
	public static void main(String [] args) {
		String nome = "Thiago";
		double n1 = 5.76;
		float n3 = 5.76f;
		int n2 = 23;
		char sexo = 'M';
		boolean v = true;
		Date dn = new Date();
		
		double soma = 23.5 + 14.4;
		int sub = 120 - 15;
		int mul = 2 * 4;
		int div = 10 / 2;
		int mod = 10 % 2;
		double res = (div*sub) + (soma*mod);
		System.out.println("resultado: " + res +"!");
		
	}
}
