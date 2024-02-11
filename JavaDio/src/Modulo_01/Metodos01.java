package Modulo_01;

public class Metodos01 {
	
	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		if(!smartTv.lig) {
			System.out.println(smartTv.vol);
			smartTv.aumVol();
		}
		System.out.println("---------");
		smartTv.ligar();
		System.out.println(smartTv.canal);
		System.out.println(smartTv.vol);
		System.out.println("---------");
		smartTv.aumCanal();
		smartTv.dimCanal();
		smartTv.mudCanal(55);
		System.out.println("---------");
		smartTv.desligar();
	}
	
}
