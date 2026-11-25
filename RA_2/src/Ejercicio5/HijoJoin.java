package Ejercicio5;

public class HijoJoin extends Thread {

	private int c;

	public HijoJoin(int c) {
		this.c = c;
		System.out.println("Creando hilo " + c);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hilo " + c + " línea " + i);
		}
	} 
}
