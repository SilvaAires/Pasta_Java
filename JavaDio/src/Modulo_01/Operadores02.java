package Modulo_01;

public class Operadores02 {
	public static void main(String[] args) {
		int n = 5;
		if(!(n==6)) {
			n++;
			System.out.println(n);
			n--;
			System.out.println(n);
			n = -n;
			System.out.println(n);
		}
		int n1 = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println(n1 = n1+2);
		}
	}
}
