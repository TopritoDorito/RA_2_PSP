package Ejercicio3;


public class HiloReloj {

	public static void main(String[] args) {

		HiloTac h1 = new HiloTac();
		HiloTic h2 = new HiloTic();

		h2.start();
		h1.start();

	}

}
