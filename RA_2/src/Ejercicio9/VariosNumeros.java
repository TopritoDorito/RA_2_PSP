package Ejercicio9;

import java.io.*;
import java.util.*;

public class VariosNumeros {

	public static void main(String[] args) {
		File file = new File("ficheros/numeros.dat");
		int totalAcumulado = 0;
		List<HiloSumador> hilos = new ArrayList<>();
		try (DataInputStream diS = new DataInputStream(new FileInputStream(file))) {
			while (true) {
				int num = diS.readInt();
				for (int i = 1; i <= 10; i++) {
					HiloSumador thread = new HiloSumador(i, num);
					hilos.add(thread);
					thread.start();
				}
			}

			
		} catch (EOFException e) {
			for (HiloSumador hilo : hilos) {
				try {
					hilo.join();
					totalAcumulado+=hilo.getCont();
				} catch (Exception e2) {
					System.out.println("Error: "+e.getMessage());
				}
			}
			System.out.println("La suma total es: "+totalAcumulado);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		}

	}

}
