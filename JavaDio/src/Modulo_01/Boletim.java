package Modulo_01;

public class Boletim {
	public static void main(String[] args) {
		int mediaFinal = 5;
		if(mediaFinal<6) {
			System.out.println("Reprovado");
		}else {
			if(mediaFinal==6) {
				System.out.println("Prova Minerva");
			}else {
				System.out.println("Aprovado");
			}
		}
	}
}