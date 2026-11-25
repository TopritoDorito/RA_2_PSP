package Ejercicio8;

public class HiloPitufo extends Thread {

	String nombreString;

	public HiloPitufo(String nombreString) {
		this.nombreString = nombreString;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(nombreString + " come " + i + " pan con queso.");
		}
		System.out.println(nombreString + " ha terminado de comer");

	}

}
