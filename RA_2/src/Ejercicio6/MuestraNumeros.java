package Ejercicio6;

public class MuestraNumeros {

	public static void main(String[] args) {

		Thread t1 = new HiloImpares();
		HiloPares t2 = new HiloPares();
		
		t1.run();
		t2.run();
	}

}
