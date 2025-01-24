package ejercicioslistas;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer10 {

public static void main(String[] args) {
		
		//llamamos al escaner
		Scanner reader = new Scanner(System.in);
		
		//usamos una lista de tipo mapa para guardar los numeros de la loteria
		HashMap<String, Integer> numeros = new HashMap<>();
				
		//creamos un array para añadir temporalmente los numeros
		String recoger = ""; 
		
		//boolean para controlar bucle while
		boolean salir = false;
		
		//variable eliminar
		String eliminar = "";
		
		//variable para que el jugador elija que hacer
		int numero;
		
	//creamos un bucle while para que salga el juegador cuando quiera
		while (!salir) {
			
		//preguntamos por que quiere hacer
		System.out.println("1. Introducir producto\n2. Eliminar producto\n3. Revisar lista productos\n0. Salir");
		numero = reader.nextInt();
		
		switch (numero) {
		case 1 -> {
			
			//preguntamos por el producto a añadir
			System.out.println("Mete 1 producto que quieras añadir:");
			recoger = reader.next();
			
			numeros.put(recoger, 0);
		}
		case 2 -> {
			
			//le enseñamos la lista de productos 
			System.out.println(numeros);
			
			//preguntamos por el producto a eliminar
			System.out.println("Que producto quieres eliminar?");
			eliminar = reader.next();
			numeros.remove(eliminar);
			
		}
		case 3 -> {
			
			//Mostramos los productos 
			System.out.println("Estos son los Productos: " + numeros );

				}
		default -> {
			
			//terminamos el bucle
			salir = true;
			
		}
		}
	}
		//cerramos el escaner
		reader.close();
	}
}
