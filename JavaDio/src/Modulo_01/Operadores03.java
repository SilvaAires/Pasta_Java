package Modulo_01;

public class Operadores03 {
	public static void main(String[] args) {
		int n = 2;
		int n1 = 3;
		
		String no = "thiago";
		String no1 = "ryan";
		
		boolean vf1 = no1.equals(no);
		System.out.println("Nome "+vf1);
		boolean vf = n == n1;
		System.out.println(vf);
		vf = n != n1;
		System.out.println(vf);
		vf = n >= n1;
		System.out.println(vf);
		vf = n <= n1;
		System.out.println(vf);
		
		if( (n == 3) || (n1 == 3)) {
			System.out.println("||");
		}
		
		if( (n == 3) && (n1 == 3)) {
			System.out.println("&&");
		}
	}
}
