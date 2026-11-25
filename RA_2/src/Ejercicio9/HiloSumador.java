package Ejercicio9;

public class HiloSumador extends Thread{

	private int cont = 0;
	private final int valorASumar;
	
	public HiloSumador(int valorInicial, int valorASumar) {
        this.cont = valorInicial;
        this.valorASumar = valorASumar;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    @Override
    public void run() {
        this.cont += this.valorASumar;
    }
	
	
	
}
