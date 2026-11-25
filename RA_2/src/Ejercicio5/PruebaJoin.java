package Ejercicio5;

public class PruebaJoin {

	public static void main(String[] args) {
		try {
			for (int i = 1; i <= 5; i++) {
				HijoJoin hilo = new HijoJoin(i);
				hilo.start();

				hilo.join();
				System.out.println(" --- ");
			}
		} catch (InterruptedException e) {
			System.err.println("Error "+e.getMessage() );
		}
		System.out.println("Todos los hilos creados");

	}

}
