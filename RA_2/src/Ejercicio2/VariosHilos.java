package Ejercicio2;

public class VariosHilos {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {
			HiloC HiloC = new HiloC(i);
			HiloC.run();
			System.out.println();
		}
		System.out.println("Todos los hilos creados");

	}

}
