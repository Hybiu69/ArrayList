package backend;

import java.util.ArrayList;
import java.util.Random;

public class Exemplo4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>(); //cria o array em lista
		
		Random random = new Random (); //classe de randomização
		
		for(int i = 0; i<5; i++) {  //for limitado a 5 numeros aleatorios
			int numeroAleatorio = random.nextInt(100); //variavel igual a classe randomica de números de 0 a 100
			numeros.add(numeroAleatorio); //adciona o numero randomico no array
		}
		for (int numero : numeros) {  //for limitado a quantidade de elementos no array
			System.out.println(numero); //mostra o array em lista
		}
	}

}