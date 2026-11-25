package Ejercicio2;

public class VariosHilos {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			HiloC hilo = new HiloC(i);
			hilo.start();
		}

		System.out.println("Todos los hilos creados");
	}
}