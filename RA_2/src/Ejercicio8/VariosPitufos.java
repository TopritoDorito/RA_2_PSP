package Ejercicio8;

public class VariosPitufos {

	public static void main(String[] args) {
		String[] nombreStrings= {"Papá pitufo", "Pitufina", "Filósofo", "Pintor","Gruñón", "Bromista", "Dormilón", "Tímido", "Tontín", "Bonachón", "Romántico"};
		
		for (String a : nombreStrings) {
			Thread hiloThread= new HiloPitufo(a);
			hiloThread.start();
		}
		
		
		
		
	}

}
