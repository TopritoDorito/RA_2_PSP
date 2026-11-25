package Ejercicio7;

public class HiloTriangulo extends Thread{

	double base,altura;

	public HiloTriangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public void run() {
		System.out.println("El area total del triangulo es: "+((base * altura)/2));
	}
	
	
	
}
