package ejercicioslistaspartedos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ejer6 {

	public static void main(String[] args) {
		
		//Llamamos al Scanner
		Scanner reader = new Scanner(System.in);
		
		//Usamos una coleecion de tipo HashMap
		HashMap<String, HashSet<Integer>> numeros = new HashMap<>();

		//creamos una variable de tipi int para elegir la opcion del menu
		int opcion = 0;
		
		//variable para guardar nombre temporalmente
		String nombre = "";
		
		//Creamos el switch para elegir la opcion
		switch (opcion) {
		case 1 -> {
			System.out.println("Dime que persona quieres añadir a la lista :");
			nombre = reader.next();
			numeros.put(nombre);
		}
		case 2 -> {
			
		}
		case 3 -> {
			
		}
		case 4 -> {
			
		}
		case 5 -> {
			
		}
		}
	}
}
