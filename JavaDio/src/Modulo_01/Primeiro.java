package Modulo_01;

public class Primeiro {
	
	public static void main(String[] args) {
		System.out.println("Oi");
		int idade = 23;
		boolean v = true;
		System.out.println(soma(1, 4));
		System.out.println(nome("Thiago","Ryan") + " " + idade + " " + v);
	}

	public static int soma(int n1, int n2) {
		return n1 + n2;
	}
	
	public static String nome(String n1, String n2) {
		return "Metodo: "+n1.concat(" "+n2);
	}
	
}