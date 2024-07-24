package backend;

import java.util.ArrayList;
import java.util.Random;

public class ListaE2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList <>();

		Random random = new Random ();

		for(int i = 0; i<10; i++) {  
			int numeroAleatorio = random.nextInt(10);
			numeros.add(numeroAleatorio);
		}
		
		System.out.println(numeros);
		

		for (int numero : numeros) {  
			System.out.println((numero*2)); 
		}

	}

}
