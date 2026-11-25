package Ejercicio7;

import java.util.Scanner;

public class MuestraArea {

	public static void main(String[] args) {
		Double baseDouble ;
		Double alturaDouble ;
		try(Scanner scanner = new Scanner(System.in)){
			for (int i = 1; i <= 10; i++) {	
	        	System.out.println("Introduzca la base: ");
	        	baseDouble = scanner.nextDouble();
	        	System.out.println("Introduzca la altura: ");
	        	alturaDouble = scanner.nextDouble();
	        	Thread t1 = new HiloTriangulo(baseDouble, alturaDouble);
	        	
	        	t1.run();
			}
		}
        
		
	}

}
