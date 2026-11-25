package Ejercicio4;

public class VariosHilosR {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			HiloCR tarea = new HiloCR(i);      
			Thread hilo = new Thread(tarea);  
			hilo.run();       
		}

		System.out.println();
		System.out.println("Todos los hilos creados");
	}
}