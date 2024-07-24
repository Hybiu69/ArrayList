package backend;

import java.util.ArrayList;

public class Exemplo3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10); //adciona um elemento no array
		numeros.add(20);
		
		System.out.println(numeros.get(0)); //mostra o elemento da posição do array
		System.out.println(numeros.get(1));
		
		numeros.set(1, 25);
		System.out.println(numeros.get(1));
		
		numeros.remove(0);
		System.out.println(numeros.get(0));
		System.out.println(numeros.size()); //mostra a quantidades de elementos no array
	}

}