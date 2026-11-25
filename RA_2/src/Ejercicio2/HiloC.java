package Ejercicio2;

public class HiloC extends Thread{

	private int c;

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public HiloC(int c) {
		this.c = c;
		
	}

	@Override
	public void start() {
		System.out.println("Creando hilo "+c);
		super.start();
	}

	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println("Hilo "+c+" línea "+i);
		}
	}
	
	
	
	
	
	
	
	
}
