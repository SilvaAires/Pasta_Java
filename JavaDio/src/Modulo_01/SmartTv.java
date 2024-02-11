package Modulo_01;

public class SmartTv {
	boolean lig = false;
	int canal = 10;
	int vol = 85;
	
	public void mudCanal(int canal) {
		this.canal = canal;
		System.out.println(canal);
	}
	public void aumCanal() {
		canal++;
		System.out.println(canal);
	}
	public void dimCanal() {
		canal--;
		System.out.println(canal);
	}
	public void aumVol() {
		vol++;
		System.out.println(vol);
	}
	public void dimVol() {
		vol--;
		System.out.println(vol);
	}
	public void ligar(){
		lig = true;
		System.out.println(lig);
	}
	public void desligar(){
		lig = false;
		System.out.println(lig);
	}
}
