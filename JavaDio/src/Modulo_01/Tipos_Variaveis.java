package Modulo_01;

public class Tipos_Variaveis {
	public static void main(String[] args) {
		double n1 = 2.500;
		double n2 = 2500;
		System.out.println(n1+ "\n" +n2);
		
		short nn1 = 1;
		int nn2 = nn1;
		short nn3 = (short) nn2;
		System.out.println(nn3);
		
		final double VALOR_DE_PI = 3.14; //Não altera dado
	}
}
