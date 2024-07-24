package backend;

import java.util.ArrayList;
import java.util.Random;

public class ListaE {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList <>();
		
		Random random = new Random ();
		
		for(int i = 0; i<10; i++) {  
			int numeroAleatorio = random.nextInt(10);
			numeros.add(numeroAleatorio);
			System.out.println(numeros);
		}
		
		numeros.remove(4);
		
		System.out.println(numeros);
		
		
	}

}