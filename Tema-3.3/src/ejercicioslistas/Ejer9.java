package ejercicioslistas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		
		//llamamos al escaner
		Scanner reader = new Scanner(System.in);
		
		//usamos una lista de tipo mapa para guardar los numeros de la loteria
		LinkedHashMap<Integer, Integer> numeros = new LinkedHashMap<>();
		
		//usamos una lista de tipo mapa para guardar los numeros de la loteria
		LinkedHashMap<Integer, Integer> numerosEspeciales = new LinkedHashMap<>();
		
		//creamos un array para añadir temporalmente los numeros
		int recoger[] = new int[5];
		
		//creamos un array para añadir temporalmente los numeros
		int recogerEstrella[] = new int[2];
		
		//boolean para controlar bucle while
		boolean salir = false;
		
		//variable para que el jugador elija que hacer
		int numero;
		
	//creamos un bucle while para que salga el juegador cuando quiera
		while (!salir) {
			
		//preguntamos por que quiere hacer
		System.out.println("1. Introducir numero loteria\n2. Salir");
		numero = reader.nextInt();
		
		//si elije 1 ejecuta el programa
		if (numero == 1) {
		//creamos un for para ir recogiendo los numeors
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println("Mete 5 pares de numeros del ultimo sorteo de loteria premiado:");
			recoger[i] = reader.nextInt();
			if (numeros.containsKey(recoger[i])) {
				numeros.put(recoger[i], numeros.get(recoger[i]) + 1);
			} else {
				numeros.put(recoger[i], 1);
			}
		}
		//pedimos las estrellas del ultimo sorteo
		for (int i = 0 ; i < 2 ; i++) {
			System.out.println("Mete las 2 estrellas :");
			recogerEstrella[i] = reader.nextInt();
			if (numerosEspeciales.containsKey(recogerEstrella[i])) {
				numerosEspeciales.put(recogerEstrella[i], numerosEspeciales.get(recogerEstrella[i]) + 1);
			} else {
				numerosEspeciales.put(recogerEstrella[i], 1);
			}
		}
		System.out.println("Estos son los Numeros Premiados: " + numeros );
		System.out.println();
		System.out.println("Estos son los Numeros Premiados Especiales: " + numerosEspeciales );
		//si no elije la opcion 1 sale del programa
		} else {
			salir = true;
		}
		}
		
		//cerramos el escaner
		reader.close();
	}
}
